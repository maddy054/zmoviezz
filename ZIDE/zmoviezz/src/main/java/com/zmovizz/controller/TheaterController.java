//$Id$
package com.zmovizz.controller;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Theater;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.persistance.ShowDAO;
import com.zmovizz.persistance.TheaterDAO;

public class TheaterController {

		TheaterDAO theaterDao = new  TheaterDAO();
		Response response = new Response();
		Logger logger = Logger.getLogger(TheaterController.class.getName());
		
		public Response get(Map<String,Object> param) {
			
			try {
				
				ShowDAO showDao = new ShowDAO();
				System.currentTimeMillis();
				 ZonedDateTime date = Instant.now().atZone( ZoneId.of("Asia/Kolkata"));
				LocalDateTime start = date.toLocalDateTime().withHour(0).withMinute(0).withSecond(0).withNano(0);
				long startMillis = start.toInstant(ZoneOffset.of("+05:30")).toEpochMilli();
				LocalDateTime end = date.toLocalDateTime().withHour(23).withMinute(59).withSecond(59).withNano(999_999_999);
				long endMillis = end.toInstant(ZoneOffset.of("+05:30")).toEpochMilli();
				int theater = Integer.parseInt(param.get("theater").toString());
				
				List<Object> result = showDao.getByTime(theater, startMillis, endMillis);
				
				
				
				response.setResponseCode(StatusCode.OK.get());
				response.setData(result);
				
			}catch(MovieException e) {
				logger.log(Level.INFO,e.getMessage(),e);
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		
		
		public Response set(List<Object> param) {
			
			try {
				theaterDao.set((Theater)param.get(0));
				response.setResponseCode(StatusCode.OK.get());
				
			}catch(MovieException e) {
				logger.log(Level.INFO,e.getMessage(),e);
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		public Response update(List<Object> param) { 
			
			try {
				theaterDao.update((Theater)param.get(0));
				response.setResponseCode(StatusCode.OK.get());
				
			}catch(MovieException e) {
				logger.log(Level.INFO,e.getMessage(),e);
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
				logger.log(Level.INFO,e.getMessage(),e);
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}

	
}
