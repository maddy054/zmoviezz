//$Id$
package com.zmovizz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Constants.MethodType;
import com.zmovizz.models.Constants.Tables;
import com.zmovizz.utility.JSONConverter;


public class MovieServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("application/json");
		resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        resp.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, APIKEY");

        if ("OPTIONS".equalsIgnoreCase(req.getMethod())) {
        	resp.setStatus(HttpServletResponse.SC_OK);
			return;
        }

		String[] pathInfo = req.getPathInfo().split("/");
		int length = pathInfo.length;
		
		MethodType method = MethodType.GET;
		Tables table =Tables.USER_DETAILS;
		Map<String,Object> parameter = new HashMap<>();
		
		String reqMethod = req.getMethod();
		Object obj = null;	
		
		switch(reqMethod) {
		
		case "POST":
			method = MethodType.POST;
			
			break;
		case "PUT":
			method = MethodType.PUT;
			break;
		case "GET":
			
			method = MethodType.GET_ALL;
			obj = parameter;
			
			if(length%2 != 0) {
				
				method = MethodType.GET;
			}
				break;
		}	
//		for(int i=1;i<length;i++) {
//			
//			if(i%2 == 0) {
//				parameter.add(pathInfo[i]);
//			}	
//		}
		
		switch (pathInfo[1]) {
		
		case "users":	
			

			if(length >= 4 ) {
				parameter.put("user", pathInfo[2]);
				
				if(pathInfo[3].equals("tickets")) {
					table =Tables.TICKET_DETAILS;
					String status = req.getParameter("status");
					if(status != null) {
						parameter.put("status",status);
					}
				}else if(pathInfo[3].equals("login") ) {
					table = Tables.USER_SESSION;
					
					parameter.put("session",req.getSession(true).getId());
					parameter.put("userAgent",req.getHeader("User-Agent"));

				}
				
			}
			
			break;
			
		case "session":
			table = Tables.USER_SESSION;
			
			parameter.put("session",req.getSession(false));
			parameter.put("userAgent",req.getHeader("User-Agent"));
			break;
			
		case "theaters":
			
			table = Tables.THEATER_DETAILS;
			String location =  req.getParameter("location");
			if(length > 2) {
				parameter.put("theater",pathInfo[2] );
			}
			if(location != null) {
				parameter.put("location",location);
			}
			
			if(length >= 4 && pathInfo[3].equals("movies")) {
				table = Tables.MOVIE_DETAILS;
				if(length>4) {
					parameter.put("movie",pathInfo[4] );
				}
				if(length >= 6 && pathInfo[5].equals("shows")) {
					
					table = Tables.SHOW_DETAILS;
					if(length >6) {
						
						System.out.println(parameter.get("show"));
					}else {
						parameter.put("date", req.getParameter("date"));
					}
					if(length >= 8 &&  pathInfo[7].equals("tickets")) {
						table = Tables.TICKET_DETAILS;
						if(length>8) {
							parameter.put("ticket",pathInfo[7] );
						}
					
					}	
				}
			}else if(length >= 4 && pathInfo[3].equals("shows")) {
				table = Tables.SHOW_DETAILS;
				Object date = req.getParameter("date");
				if(length>4) {
					parameter.put("show",pathInfo[4] );
				}else if(date != null){
					parameter.put("date", date);
				}
				if(length >= 6 &&  pathInfo[5].equals("tickets")) {
					table = Tables.TICKET_DETAILS;
					if(length>6) {
						parameter.put("ticket",pathInfo[7] );
					}
				
				}	
			} 
	
		break;
		case "movies":
			table =  Tables.MOVIE_DETAILS;
			if(pathInfo.length > 2) {
				parameter.put("movieId", pathInfo[2]);
			}
			
			String name = req.getParameter("name");
			String page = req.getParameter("page");
			String type = req.getParameter("type");
			if(name != null ) {
				parameter.put("name",name);
			}if(page != null) {
				parameter.put("page",Integer.parseInt(page));
			}if(type != null) {
				parameter.put("type", type);
			}
			
			if(length >= 4 && pathInfo[3].equals("reviews")) {
				table = Tables.REVIEWS;
			}
			
		
		break;
		case "locations":
			table = Tables.LOCATIONS;
			Object locationName = req.getParameter("name");
			if(locationName != null) {
				parameter.put("locationName",locationName);
			}
			
			break;
		
			
		}
		
			
	
		if(reqMethod.equals("PUT") ||reqMethod.equals("POST")) {
			
			if(!pathInfo[1].equals("session")) {
			try {
				
				JSONObject jsonObj = JSONConverter.getJsonObj(req);
			
				obj = JSONConverter.convertJSONToObject(jsonObj,Class.forName(table.getPojo()));
				parameter.put("object", obj);
				
			} catch (MovieException | ClassNotFoundException  e) {
				
				e.printStackTrace();
			}
			}
		}
		
		String jsonStr = null;
		try {
			Class<?> target = Class.forName(table.getController());
		
			Object object = target.getDeclaredConstructor().newInstance();
			
			Method TargetMethod = target.getDeclaredMethod(method.get(),Map.class);
			
			Object result = TargetMethod.invoke(object, parameter);
			
			jsonStr = JSONConverter.getJson(result);
		     
			
		}catch(InstantiationException| IllegalAccessException| IllegalArgumentException| InvocationTargetException| NoSuchMethodException| SecurityException |ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		
		 PrintWriter out = resp.getWriter();
			out.print(jsonStr);
	        out.flush();	
	}
	

}