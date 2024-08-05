//$Id$
package com.zmovizz.controller;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Ticket;
import com.zmovizz.models.Constants.Status;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.persistance.TicketDAO;

public class TicketController {
	
	
		TicketDAO ticketDao = new  TicketDAO();
		Response response = new Response();
		Logger logger = Logger.getLogger(TicketController.class.getName());
		
		public Response get(Map<String,Object> param) {
			
			try {
				
				Ticket result = ticketDao.get(Integer.parseInt(param.get("tickets").toString()));
				
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
				Ticket ticket = (Ticket) param.get("object");
				ticket.setStatus(Status.SUCCESS);
				System.out.println(ticket.getPayment());
				ticketDao.set(ticket);
				response.setResponseCode(StatusCode.OK.get());
				
			}catch(MovieException e) {
				logger.log(Level.INFO,e.getMessage(),e);
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		
		public Response update(Map<String,Object> param) { 
			
			try {
				ticketDao.cancelTicket((Ticket)param.get("object"));
				response.setResponseCode(StatusCode.OK.get());
				
			}catch(MovieException e) {
				logger.log(Level.INFO,e.getMessage(),e);
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		
		public 	Response getAll(Map<String,Object> param) {
			
			try {
			
				Object showId = param.get("shows");
				Object type = param.get("type");
				
				
				if(type != null) {
					StringBuilder seat = new StringBuilder();
					List<Object> result = ticketDao.getAllForShow(Integer.parseInt(showId.toString()));
					for(Object showObj : result) {
						Ticket show = (Ticket)showObj;
						seat.append(show.getSeat());
						seat.append(",");
						
					}
					String[] seats = seat.toString().split(",");
					response.setData(seats);
				
				}else {
					response.setData( ticketDao.getTicketForShow(Integer.parseInt(showId.toString())));
				}
				response.setResponseCode(StatusCode.OK.get());
				
			}catch(MovieException e) {
				logger.log(Level.INFO,e.getMessage(),e);
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		
		

	
}
