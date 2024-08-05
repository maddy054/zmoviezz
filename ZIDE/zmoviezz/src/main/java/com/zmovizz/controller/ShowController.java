//$Id$
package com.zmovizz.controller;

import java.util.List;
//
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Show;

import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.persistance.MovieDAO;
import com.zmovizz.persistance.ShowDAO;
import com.zmovizz.utility.Converter;

public class ShowController {
	ShowDAO showDao = new  ShowDAO();
	Response response = new Response();
	MovieDAO movieDao = new MovieDAO();
	Logger logger = Logger.getLogger(ShowController.class.getName());
	
	public Response get(Map<String,Object> param) {
		
		try {
			
			Show result = showDao.get(Integer.parseInt(param.get("shows").toString()));
			
			response.setResponseCode(StatusCode.OK.get());
			response.setData(result);
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	
	public Response set(Map<String, Object> param) {
		
		try {
			Show show = (Show)param.get("object");
			
			long time = Converter.getStartOfDay(show.getTime());
			long endTime = Converter.endOfDay(System.currentTimeMillis());
		List<Object> existingShow = showDao.getByTime(show.getTheater(), time, endTime);
		
		if(existingShow.size() >=3  ) {
			response.setMessage("Only 3 shows are allowed per day");
			throw new MovieException(StatusCode.FORBIDDEN);
		}
			showDao.set((Show)param.get("object"));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public Response update(Map<String, Object> param) { 
		
		try {
			showDao.update((Show)param.get("object"));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	public 	Response getAll(Map<String,Object> param) {
		
		
		try {
			Object location = param.get("location");
			Object resultObj ;
			if(location != null) {
				resultObj = showDao.getAllForMovie(Integer.parseInt(param.get("movies").toString()),Integer.parseInt(param.get("location").toString()), Long.parseLong(param.get("date").toString()));
			}else {
				
			resultObj = showDao.getAll(Integer.parseInt(param.get("theaters").toString()),Long.parseLong( param.get("date").toString()));
			
			
			}
			
			
			response.setData(resultObj);
			
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}

}
