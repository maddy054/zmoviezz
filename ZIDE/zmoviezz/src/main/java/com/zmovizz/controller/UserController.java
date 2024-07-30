 	//$Id$
package com.zmovizz.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONObject;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Response;
import com.zmovizz.models.User;
import com.zmovizz.persistance.UserDAO;
import com.zmovizz.utility.Converter;
import com.zmovizz.utility.JSONConverter;

public class UserController {
	UserDAO userDao = new  UserDAO();
	Response response = new Response();
	Logger logger = Logger.getLogger(UserController.class.getName());
	
	public Response get(List<Object> param) {
		
		try {
			
			User result = userDao.get(Integer.parseInt(param.get(0).toString()));
			JSONObject json = JSONConverter.getJsonObj(result);
			json.remove("password");
			json.remove("createdAt");
			
			response.setResponseCode(0);
			response.setData(json.toMap());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	
	public Response set(List<Object> param) {
		
		try {
			User user = (User)param.get(0);
			user.setCreatedAt(System.currentTimeMillis());
			user.setPassword(Converter.getSHA(user.getPassword()));
			userDao.set(user);
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public Response update(List<Object> param) { 
		
		try {
			userDao.update((User)param.get(0));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public 	Response getAll(List<Object> param) {
		
		try {
			List<Object> result = userDao.getAll();
			for(int i=0;i<result.size();i++) {
				JSONObject json = JSONConverter.getJsonObj(result.get(i));
				json.remove("password");
				json.remove("createdAt");
				result.remove(i);
				result.add(i, json.toMap());
			}
			 response.setData(result);
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}

}
