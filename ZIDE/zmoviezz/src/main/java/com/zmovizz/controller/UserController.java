 	//$Id$
package com.zmovizz.controller;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONObject;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Constants.UserRole;
import com.zmovizz.models.Response;
import com.zmovizz.models.User;
import com.zmovizz.persistance.UserDAO;
import com.zmovizz.utility.Converter;
import com.zmovizz.utility.JSONConverter;

public class UserController {
	UserDAO userDao = new  UserDAO();
	Response response = new Response();
	Logger logger = Logger.getLogger(UserController.class.getName());
	
	public Response get(Map<String,Object> param) {
		
		try {
			Object user = param.get("users");
			Object mobile = param.get("mobileNumber");
			if(mobile != null) {
				user = mobile;
			}
			User result = userDao.get(Integer.parseInt(user.toString()));
			JSONObject json = JSONConverter.getJsonObj(result);
			json.remove("password");
			json.remove("createdAt");
			
			response.setResponseCode(StatusCode.OK.get());
			response.setData(json.toMap());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}

	
	public Response set(Map<String,Object> param) {
		
		try {
			User user = (User)param.get("object");
			user.setCreatedAt(System.currentTimeMillis());
			user.setPassword(Converter.getSHA(user.getPassword()));
			user.setRole(UserRole.CUSTOMER);
			userDao.set(user);
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public Response update(Map<String,Object> param) { 
		
		try {
			userDao.update((User)param.get("object"));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public 	Response getAll(Map<String,Object> param) {
		
		return get(param);
	}

}
