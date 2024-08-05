//$Id$
package com.zmovizz.controller;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Theater;
import com.zmovizz.models.User;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Constants.UserRole;
import com.zmovizz.persistance.ShowDAO;
import com.zmovizz.persistance.TheaterDAO;
import com.zmovizz.persistance.UserDAO;

public class TheaterController {

		TheaterDAO theaterDao = new  TheaterDAO();
		Response response = new Response();
		Logger logger = Logger.getLogger(TheaterController.class.getName());
		
		public Response get(Map<String,Object> param) {
			
			try {
				
				ShowDAO showDao = new ShowDAO();
			
				ZonedDateTime date = Instant.now().atZone( ZoneId.of("Asia/Kolkata"));
				LocalDateTime start = date.toLocalDateTime().withHour(0).withMinute(0).withSecond(0).withNano(0);
				long startMillis = start.toInstant(ZoneOffset.of("+05:30")).toEpochMilli();
				
				LocalDateTime end = date.toLocalDateTime().withHour(23).withMinute(59).withSecond(59).withNano(999_999_999);
				long endMillis = end.toInstant(ZoneOffset.of("+05:30")).toEpochMilli();
				int theater = Integer.parseInt(param.get("theaters").toString());
				
				List<Object> result = showDao.getByTime(theater, startMillis, endMillis);
				
				
				
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
				Theater theater = (Theater)param.get("object");
				int manager = theater.getManager();
				UserDAO userDao = new UserDAO();
				User user = userDao.get(manager);
				user.setRole(UserRole.MANAGER);
				userDao.update(user);
				
				theaterDao.set(theater);
				response.setResponseCode(StatusCode.OK.get());
				
			}catch(MovieException e) {
				logger.log(Level.INFO,e.getMessage(),e);
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		public Response update(Map<String,Object> param) { 
			
			try {
				theaterDao.update((Theater)param.get("object"));
				response.setResponseCode(StatusCode.OK.get());
				
			}catch(MovieException e) {
				logger.log(Level.INFO,e.getMessage(),e);
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		
		public 	Response getAll(Map<String,Object> param) {
			int limit = 15;
			
			try {
			    List<Object> result =  new ArrayList<Object>();
				response.setResponseCode(StatusCode.OK.get());
				Object location = param.get("location");
				Object name = param.get("name");

				if(name != null) {
					result = theaterDao.getAllByName(param.get("name").toString(),Integer.parseInt(param.get("location").toString()));
				}else if(location != null){
					
					result = theaterDao.getAllByLocation(Integer.parseInt(param.get("location").toString()));
				}else {
					result = theaterDao.getAll(limit);
				}
				response.setData(result);
				
				
			}catch(MovieException e) {
				logger.log(Level.INFO,e.getMessage(),e);
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}

	
}
