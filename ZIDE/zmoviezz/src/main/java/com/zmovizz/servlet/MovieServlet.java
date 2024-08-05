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


		String[] pathInfo = req.getPathInfo().split("/");
		int length = pathInfo.length;
		Tables table = Tables.USER_SESSION;
		MethodType method = MethodType.GET;
		
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
		for(int i=1;i<length;i++) {
			
			if(i%2 == 0) {
				parameter.put(pathInfo[i-1],pathInfo[i]);
			}	
		}
		
		Map<String, String[]> ParameterMapp = req.getParameterMap();
		
		for(String key:ParameterMapp.keySet()) {
			parameter.put(key, req.getParameter(key));
		}
		
		Tables[] values = Tables.values();
		
		String finalResource = pathInfo[length-1];
		
		if(length%2 != 0) {
			finalResource = pathInfo[length-2];
		}
		
		for(Tables enumTable :values) {
			if(enumTable.getUrl().equals(finalResource)){
				table = enumTable;
				if(finalResource.equals("sessions")) {
					parameter.put("session",req.getSession(false));
					parameter.put("userAgent",req.getHeader("User-Agent"));
				}
				
			}
		}
		
		if(pathInfo.length>=2 && pathInfo[1].equals("login")) {
			table = Tables.USER_SESSION;
			parameter.put("session",req.getSession(true).getId());
			parameter.put("userAgent",req.getHeader("User-Agent"));
		}
			
	
		if(reqMethod.equals("PUT") ||reqMethod.equals("POST")) {
			
			if(!pathInfo[1].equals("sessions")) {
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