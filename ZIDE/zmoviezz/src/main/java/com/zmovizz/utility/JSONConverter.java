//$Id$
package com.zmovizz.utility;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Constants.Language;
import com.zmovizz.models.Constants.MovieType;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Constants.UserRole;


public class JSONConverter {
	
	
	public static String getJson(Object object) {
		
		Gson gson = new Gson();
		return gson.toJson(object);
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
	
	public static JSONObject getJsonObj(HttpServletRequest req) throws MovieException {
		
		StringBuilder stringBuilder = new StringBuilder();
        
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(req.getInputStream(), "UTF-8"))) {
            char[] charBuffer = new char[1024];
            int bytesRead;
            while ((bytesRead = bufferedReader.read(charBuffer)) != -1) {
                stringBuilder.append(charBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
        	e.printStackTrace();
        	throw new MovieException(StatusCode.SQL_ERROR);
		
		} 
	   
	      return new JSONObject(stringBuilder.toString());
	}
	

	
	 public static <T> T convertJSONToObject(JSONObject jsonObject, Class<T> clazz) throws MovieException {
	
		try {
			
		   
	        T object = clazz.getDeclaredConstructor().newInstance();

	        for (Field field : clazz.getDeclaredFields()) {
	            String fieldName = field.getName();
	            Class<?> fieldType = field.getType();
	            
	            if (jsonObject.has(fieldName)) {
	                Object value = jsonObject.get(fieldName);
	               
	                
	                if (fieldType.equals(int.class)) {
	               
	                    value = Integer.valueOf(value.toString());
	                    	
	                } else if (fieldType.equals(double.class) ) {
	                
	                	
	                    value = Double.valueOf(value.toString());
	                    
	                } else if (fieldType.equals(long.class)) {
	             
	                	
	                    value = Long.valueOf(value.toString());
	                    
	                } else if(fieldType.equals(UserRole.class)) {
	                	
	                	value = UserRole.valueOf(value.toString());
	                	
	                }else if(fieldType.equals(MovieType.class)) {
	                
	                	value = MovieType.valueOf(value.toString());
	                }else if(fieldType.equals(Language.class)) {
	                	value = Language.valueOf(value.toString());
	                }
	           
	                
	                
	                Method setter;
					
						setter = clazz.getMethod("set" + capitalize(fieldName), fieldType);
						   setter.invoke(object, value);
	             
	            }
	        }
	        
	        return object;
		 }catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException  e) {
				
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