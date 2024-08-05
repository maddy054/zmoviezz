//$Id$
package com.zmovizz.controller;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Location;
import com.zmovizz.persistance.LocationDAO;

public class LocationController {
	LocationDAO locationDao = new  LocationDAO();
	Response response = new Response();
	Logger logger = Logger.getLogger(LocationController.class.getName());
	
	
	public Response get(Map<String,Object> param) {
		
		try {
			
			Location result = (Location) locationDao.get((int)param.get("locations"));
			response.setResponseCode(StatusCode.OK.get());
			response.setData(result);
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	
	public Response set(Map<String,Object> param) {
		
		try {
			locationDao.set((Location)param.get("object"));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public Response update(Map<String,Object> param) { 
		
		try {
			locationDao.update((Location)param.get("object"));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
		
	public 	Response getAll(Map<String,Object> param) {
		
		try {
			List<Object> result ;
			Object name = param.get("name");
			if(name == null) {
				result = locationDao.getAll();
			}else {
				result = locationDao.getAll(name.toString());
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
