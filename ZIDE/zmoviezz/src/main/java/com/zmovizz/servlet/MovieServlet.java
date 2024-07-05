//$Id$
package com.zmovizz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Constants.MethodType;
import com.zmovizz.models.Constants.Tables;
import com.zmovizz.utility.JSONConverter;


public class MovieServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(true);
		System.out.println(session.getId());
		String[] pathInfo = req.getPathInfo().split("/");
		int length = pathInfo.length;
		
		MethodType method = MethodType.GET;
		Tables table =Tables.USER_DETAILS;
		List<Object> parameter = new ArrayList<Object>();
		
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
		for(int i=1;i<length;i++) {
			
			if(i%2 == 0) {
				parameter.add(pathInfo[i]);
			}	
		}
		
		switch (pathInfo[1]) {
		
		case "users":	
			

			if(length >= 4) {
				table =Tables.TICKET_DETAILS;
				String status = req.getParameter("status");
				if(status != null) {
					parameter.add(status);
				}
			}
			
			break;
			
		case "theaters":
			
			table = Tables.THEATER_DETAILS;
			String location =  req.getParameter("location");
			if(location != null) {
				parameter.add(location);
			}
			
			if(length >= 4 && pathInfo[3].equals("movies")) {
				table = Tables.MOVIE_DETAILS;
				if(length >= 6 && pathInfo[5].equals("shows")) {
					table = Tables.SHOW_DETAILS;
					if(length >= 8 &&  pathInfo[7].equals("tickets")) {
						table = Tables.TICKET_DETAILS;
					
					}	
				}
			}
	
		break;
		case "movies":
			table =  Tables.MOVIE_DETAILS;
			String name = req.getParameter("name");
			if(name != null ) {
				parameter.add(name);
			}
			if(length >= 4 && pathInfo[3].equals("reviews")) {
				table = Tables.REVIEWS;
			}
			
			
		break;
		case "locations":
			table = Tables.LOCATIONS;
			Object locationName = req.getParameter("name");
			if(locationName != null) {
				parameter.add(locationName);
			}
			
			break;
		}
		

		if(reqMethod.equals("PUT") ||reqMethod.equals("POST")) {
			try {
				
				obj = JSONConverter.convertJSONToObject(req,Class.forName(table.getPojo()));
				parameter.add(0, obj);
				
			} catch (MovieException | ClassNotFoundException  e) {
				
				e.printStackTrace();
			}
		}
		
		String json = null;
		try {
			Class<?> target = Class.forName(table.getController());
		
			Object object = target.getDeclaredConstructor().newInstance();
			
			Method TargetMethod = target.getDeclaredMethod(method.get(),List.class);
			
			Object result = TargetMethod.invoke(object, parameter);
			
		     json = JSONConverter.getJson(result);
		     
			
		}catch(InstantiationException| IllegalAccessException| IllegalArgumentException| InvocationTargetException| NoSuchMethodException| SecurityException |ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		
		 PrintWriter out = resp.getWriter();
			out.print(JSONConverter.getJson(json));
	        out.flush();	
	}
	

}