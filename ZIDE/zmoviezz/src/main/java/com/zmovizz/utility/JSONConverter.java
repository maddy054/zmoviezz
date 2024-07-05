//$Id$
package com.zmovizz.utility;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Constants.StatusCode;


public class JSONConverter {
	
	
	public static String getJson(Object object) {
		
	
		 ObjectMapper objectMapper = new ObjectMapper();
		 String json = "";
	     try {
			json = objectMapper.writeValueAsString(object);
			
		} catch (JsonProcessingException e) {
			
		}
	     return json;
	}
	
	public static  JSONObject getJsonObj(Object object) throws MovieException {
		 ObjectMapper objectMapper = new ObjectMapper();
		 String json = "";
	     try {
			json = objectMapper.writeValueAsString(object);
			
			return new JSONObject(json);
		} catch (JsonProcessingException e) {
			throw new MovieException(StatusCode.OTHER_ERROR);
		}
	     
	}
	

	
	 public static <T> T convertJSONToObject(HttpServletRequest req, Class<T> clazz) throws MovieException {
	
		try {
			StringBuilder stringBuilder = new StringBuilder();
	        
			try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(req.getInputStream(), "UTF-8"))) {
	            char[] charBuffer = new char[1024];
	            int bytesRead;
	            while ((bytesRead = bufferedReader.read(charBuffer)) != -1) {
	                stringBuilder.append(charBuffer, 0, bytesRead);
	            }
	        } 
		   
		      JSONObject jsonObject = new JSONObject(stringBuilder.toString());
	        T object = clazz.getDeclaredConstructor().newInstance();

	        for (Field field : clazz.getDeclaredFields()) {
	            String fieldName = field.getName();
	            Class<?> fieldType = String.class;
	            
	            if (jsonObject.has(fieldName)) {
	                Object value = jsonObject.get(fieldName);
	                
	                
	                if (field.getType().equals(int.class)) {
	                	fieldType = Integer.class;
	                    value = Integer.valueOf(value.toString());
	                    	
	                } else if (field.getType().equals(double.class) ) {
	                	fieldType = Double.class;
	                	
	                    value = Double.valueOf(value.toString());
	                    
	                } else if (field.getType().equals(long.class)) {
	                	fieldType = Long.class;
	                	
	                    value = Long.valueOf(value.toString());
	                } 
	                System.out.println(field.getType().getClass());
	                
	                
	                Method setter;
					
						setter = clazz.getMethod("set" + capitalize(fieldName), fieldType);
						   setter.invoke(object, value);
	             
	            }
	        }
	        
	        return object;
		 }catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException | IOException e) {
				
				e.printStackTrace();
				throw new MovieException(StatusCode.SQL_ERROR);
			}

	       
	    }


	 private static String capitalize(String str) {
		 
	        if (str == null || str.length() == 0) {
	            return str;
	        }
	        return str.substring(0, 1).toUpperCase() + str.substring(1);
	    }

	
}