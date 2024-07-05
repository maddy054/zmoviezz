//$Id$
package com.zmovizz.persistance;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;

import com.zmovizz.models.Ticket;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Constants.Tables;
import com.zmovizz.utility.CustomLogger;
import com.zmovizz.utility.QueryBuilder;

public class TicketDAO {

	public Ticket get(Integer user) throws MovieException {
		
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.TICKET_DETAILS.get());
		
		try {
			String query = queryBuilder.where(1).buildSelect();
			List<Object> result = queryBuilder.executeQuery(Ticket.class, query,user);
			if(result.isEmpty()) {
				throw new MovieException(StatusCode.NOT_FOUND);
			}
			return(Ticket) result.get(0);
			
		} catch (SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	}
	
	
	public void set(Ticket ticket) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.TICKET_DETAILS.get());
		
		try {
			String query = queryBuilder.buildInsert();
			queryBuilder.execute(query,ticket);
		} catch (SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	}
	
	public void cancelTicket(Ticket ticket) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.TICKET_DETAILS.get());
		
		try {
			String query = queryBuilder.column(5).where(1).buildUpdate();
			queryBuilder.execute(query,ticket);
		} catch (SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	}
	public List<Object> getAllForUser(int userId) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.TICKET_DETAILS.get());
		
		try {
			String query = queryBuilder.where(3).buildSelect();
			return queryBuilder.executeQuery(Ticket.class, query,userId);
		} catch (SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		
		}
	}
	public List<Object> getAllForShow(int show) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.TICKET_DETAILS.get());
		
		try {
			String query = queryBuilder.where(2).buildSelect();
			return queryBuilder.executeQuery(Ticket.class, query,show);
		} catch (SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		
		}
	}
	public List<Object> getAlllWithStatus(int user,int status) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.TICKET_DETAILS.get());
		
		try {
			String query = queryBuilder.where(3,5).buildSelect();
			return queryBuilder.executeQuery(Ticket.class, query,user,status);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		
		}
	}
	
}
