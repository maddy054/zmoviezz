	//$Id$
package com.zmovizz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Review;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.persistance.ReviewDAO;

public class ReviewController {
	ReviewDAO reviewDao = new  ReviewDAO();
	Response response = new Response();
	Logger logger = Logger.getLogger(ReviewController.class.getName());
	
	public Response get(Map<String,Object> param) {
		
		try {
			
			Review result = (Review) reviewDao.get((int)param.get("reviews"));
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
			Review review = (Review) param.get("object");
		
			reviewDao.set(review);
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	public 	Response getAll(Map<String,Object> param) {
			Object targetObj = param.get("movies");
			Object theater = param.get("theaters");
			StatusCode status = StatusCode.OK;	
		
			int target = 0;
		try {
			if(theater != null) {
				target = 1;
				targetObj =  theater;
			}
		
			List<Object> result = reviewDao.getAll(Integer.parseInt(targetObj.toString()),target);
			if(result.isEmpty()) {
				status =StatusCode.NOT_FOUND;
			}
			response.setData(result);
			response.setResponseCode(status.get());
			
		}catch(MovieException e) {
			logger.log(Level.INFO,e.getMessage(),e);
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}


}
