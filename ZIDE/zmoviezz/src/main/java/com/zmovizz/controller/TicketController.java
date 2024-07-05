//$Id$
package com.zmovizz.controller;

import java.util.List;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Response;
import com.zmovizz.models.Show;
import com.zmovizz.models.Ticket;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Payment;
import com.zmovizz.persistance.PaymentDAO;
import com.zmovizz.persistance.ShowDAO;
import com.zmovizz.persistance.TicketDAO;

public class TicketController {
	
	
		TicketDAO ticketDao = new  TicketDAO();
		Response response = new Response();
		
		
		public Response get(List<Object> param) {
			
			try {
				
				Ticket result = ticketDao.get(Integer.parseInt(param.get(1).toString()));
				
				response.setResponseCode(StatusCode.OK.get());
				response.setData(result);
				
			}catch(MovieException e) {
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		
		
		public Response set(List<Object> param) {
			
			try {
				Ticket ticket = (Ticket)param.get(0);
				ShowDAO show  = new ShowDAO();
				
				int showId = Integer.parseInt(param.get(3).toString());
				int ticketAmount = show.getTicketPrice(showId);
				long time = System.currentTimeMillis();
				
				ticket.setBookingTime(time);
				ticket.setStatus(0);
				
				
				ticket.setShow(showId);
				ticket.setTicketAmount(ticketAmount);
				ticket.setPayableAmount(ticketAmount+20);
				PaymentDAO payment = new PaymentDAO();
				ticket.setMode(3);
				ticket.getMode();
				payment.set((Payment)ticket);
				int paymentId = payment.getId(ticket.getUserId(), time);
				ticket.setPaymentId(paymentId);
				
				ticketDao.set(ticket);
				response.setResponseCode(StatusCode.OK.get());
				
			}catch(MovieException e) {
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		
		public Response update(Object obj) { 
			
			try {
				ticketDao.cancelTicket((Ticket)obj);
				response.setResponseCode(StatusCode.OK.get());
				
			}catch(MovieException e) {
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}
		public 	Response getAll(List<Object> param) {
			
			try {
				if(param.size() == 1) {
					
					response.setData(ticketDao.getAllForUser(Integer.parseInt(param.get(0).toString())));
				}else if(param.size() == 2) {
					response.setData(ticketDao.getAlllWithStatus(Integer.parseInt(param.get(0).toString()),Integer.parseInt(param.get(1).toString())));
				}else if(param.size() == 3) {
					response.setData(ticketDao.getAllForShow(Integer.parseInt(param.get(2).toString())));
				}
				response.setResponseCode(StatusCode.OK.get());
				
			}catch(MovieException e) {
				response.setResponseCode(e.getError().get());
				
			}
			return response;
		}

	
}
