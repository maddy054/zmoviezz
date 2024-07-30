//$Id$
package com.zmovizz.controller;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONObject;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Show;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.persistance.MovieDAO;
import com.zmovizz.persistance.ShowDAO;

public class ShowController {
	ShowDAO showDao = new  ShowDAO();
	Response response = new Response();
	MovieDAO movieDao = new MovieDAO();
	Logger logger = Logger.getLogger(ShowController.class.getName());
	
	public Response get(Map<String,Object> param) {
		
		try {
			
			Show result = showDao.get(Integer.parseInt(param.get("show").toString()));
			
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
			
			showDao.set((Show)param.get("object"));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public Response update(List<Object> param) { 
		
		try {
			showDao.update((Show)param.get(0));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	public 	Response getAll(Map<String,Object> param) {
		
		
		try {
	
			List<Object> showDetails = showDao.getAll(Integer.parseInt(param.get("theater").toString()),Long.parseLong( param.get("date").toString()));
		

			
			response.setData(showDetails);
			
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}

}
