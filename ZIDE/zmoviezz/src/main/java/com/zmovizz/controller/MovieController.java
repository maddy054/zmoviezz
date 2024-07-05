//$Id$
package com.zmovizz.controller;

import java.util.List;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Movie;
import com.zmovizz.persistance.MovieDAO;

public class MovieController {
	MovieDAO movieDao = new  MovieDAO();
	Response response = new Response();
	
	
	public Response get(List<Object> param) {
		
		try {
			
			Movie result = (Movie) movieDao.get(Integer.parseInt( param.get(param.size()-1).toString()));
			response.setResponseCode(StatusCode.OK.get());
			response.setData(result);
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	
	public Response set(List<Object> param) {
		
		try {
			movieDao.set((Movie)param.get(0));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public Response update(List<Object> param) { 
		
		try {
			movieDao.update((Movie)param.get(0));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public 	Response getAll(List<Object> param) {
		
		try {
			
			
			response.setData(movieDao.getAll(Integer.parseInt(param.get(0).toString())));
			
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}


}
