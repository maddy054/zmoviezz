//$Id$
package com.zmovizz.controller;

import java.util.List;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Review;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.persistance.ReviewDAO;

public class ReviewController {
	ReviewDAO reviewDao = new  ReviewDAO();
	Response response = new Response();
	
	
	public Response get(List<Object> param) {
		
		try {
			
			Review result = (Review) reviewDao.get((int)param.get(0));
			response.setResponseCode(StatusCode.OK.get());
			response.setData(result);
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	
	public Response set(List<Object> param) {
		
		try {
			Review review = (Review) param.get(0);
			review.setTime(System.currentTimeMillis());
			reviewDao.set(review);
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}
	
	public 	Response getAll(List<Object> param) {
		
		try {
			response.setData(reviewDao.getAll(Integer.parseInt(param.get(0).toString()),0));
			
			response.setResponseCode(StatusCode.OK.get());
			
		}catch(MovieException e) {
			response.setResponseCode(e.getError().get());
			
		}
		return response;
	}


}
