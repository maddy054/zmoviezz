//$Id$
package com.zmovizz.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Movie;
import com.zmovizz.persistance.MovieDAO;

public class MovieController {
	MovieDAO movieDao = new  MovieDAO();
	Response response = new Response();
	Logger logger = Logger.getLogger(MovieController.class.getName());
	
	
	public Response get(Map<String,Object> param) {
		
		try {
			
			Movie result = (Movie) movieDao.get(Integer.parseInt( param.get("movieId").toString()));
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
			movieDao.set((Movie)param.get("object"));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public Response update(Map<String,Object> param) { 
		
		try {
			Movie movie = (Movie)param.get("object");
			movie.setId(Integer.parseInt(param.get("movieId").toString()));
			
			movieDao.update((Movie)param.get("object"));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public 	Response getAll(Map<String,Object> param) {
		int count = 5;
		int searchCount = 5;
		List<Object> data = new ArrayList<Object>();
		try {
			Object page = param.get("page");
			Object name = param.get("name");
			Object type = param.get("type");
			
			if(name != null) {
				data = movieDao.searchMovie(name.toString(), searchCount);
			}	
			else if(type != null) {
				int offset = Integer.parseInt(page.toString())*count;
				
				if(type.equals("recent") || type.equals("all")) {
					 data.addAll( movieDao.getAllRecent(count,offset));
				}if(type.equals("upcoming") || type.equals("all")){
					 data.addAll(movieDao.getAllUpcoming(count,offset));
				} if(type.equals("today")) {
					
				}
			}

			Object resData = new Object();
			if(type != null && type.equals("all")){
				Map<String , List<Object>> result = new HashMap<String, List<Object>>();
				result.put("recentMovies", data.subList(0, 4));
				result.put("upcomingMovies", data.subList(5, data.size()));
				resData = result;
			}else {
				resData = data;
			}
			response.setData(resData);
			
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	private void replaceData() {
		
	}
}
