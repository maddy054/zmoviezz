//$Id$
package com.zmovizz.controller;

import java.util.List;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Theater;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.persistance.TheaterDAO;

public class TheaterController {

		TheaterDAO theaterDao = new  TheaterDAO();
		Response response = new Response();
		
		
		public Response get(List<Object> param) {
			
			try {
				
				Theater result = theaterDao.get(Integer.parseInt(param.get(0).toString()));
				
				response.setResponseCode(StatusCode.OK.get());
				response.setData(result);
				
			}catch(MovieException e) {
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		
		
		public Response set(List<Object> param) {
			
			try {
				theaterDao.set((Theater)param.get(0));
				response.setResponseCode(StatusCode.OK.get());
				
			}catch(MovieException e) {
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		public Response update(List<Object> param) { 
			
			try {
				theaterDao.update((Theater)param.get(0));
				response.setResponseCode(StatusCode.OK.get());
				
			}catch(MovieException e) {
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		
		public 	Response getAll(List<Object> param) {
			
			try {
			    List<Object> result;
				response.setResponseCode(StatusCode.OK.get());
			
			    int length = param.size();
				if(length == 1) {
					result = theaterDao.getAllByLocation(Integer.parseInt(param.get(0).toString()));
				}else {
					result = theaterDao.getAllByName(param.get(0).toString(),Integer.parseInt(param.get(1).toString()));
				}
				response.setData(result);
				
				
			}catch(MovieException e) {
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}

	
}
