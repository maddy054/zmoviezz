//$Id$
package com.zmovizz.controller;

import java.util.List;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Location;
import com.zmovizz.persistance.LocationDAO;

public class LocationController {
	LocationDAO locationDao = new  LocationDAO();
	Response response = new Response();
	
	
	public Response get(List<Object> param) {
		
		try {
			
			Location result = (Location) locationDao.get((int)param.get(0));
			response.setResponseCode(StatusCode.OK.get());
			response.setData(result);
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	
	public Response set(List<Object> param) {
		
		try {
			locationDao.set((Location)param.get(0));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public Response update(List<Object> param) { 
		
		try {
			locationDao.update((Location)param.get(0));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
		
	public 	Response getAll(List<Object> param) {
		
		try {
			List<Object> result ;
			
			if(param.isEmpty()) {
				result = locationDao.getAll();
			}else {
				result = locationDao.getAll((String)param.get(0));
			}
			
			response.setData(result);
			
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}


}
