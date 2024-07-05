//$Id$
package com.zmovizz.controller;

import java.util.List;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Show;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.persistance.ShowDAO;

public class ShowController {
	ShowDAO showDao = new  ShowDAO();
	Response response = new Response();
	
	
	public Response get(List<Object> param) {
		
		try {
			
			Show result = showDao.get(Integer.parseInt(param.get(2).toString()));
			
			response.setResponseCode(StatusCode.OK.get());
			response.setData(result);
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	
	public Response set(List<Object> param) {
		
		try {
			
			showDao.set((Show)param.get(0));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	public Response update(List<Object> param) { 
		
		try {
			showDao.update((Show)param.get(0));
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	public 	Response getAll(List<Object> param) {
		
		try {
			response.setData(showDao.getAll(Integer.parseInt(param.get(1).toString()),Integer.parseInt(param.get(0).toString()),System.currentTimeMillis()));
			
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}

}
