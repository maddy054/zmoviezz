//$Id$
package com.zmovizz.persistance;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Theater;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Constants.Tables;
import com.zmovizz.utility.CustomLogger;
import com.zmovizz.utility.QueryBuilder;

public class TheaterDAO {

	public  Theater get(Integer theaterId) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.THEATER_DETAILS.get());
		
		try {
			String query = queryBuilder.where(1).buildSelect();
			List<Object> result = queryBuilder.executeQuery(Theater.class, query,theaterId);
			if(result.isEmpty()) {
				throw new MovieException(StatusCode.NOT_FOUND);
			}
			return (Theater)result.get(0);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
		
		}
	}
	
	public void set(Theater theater) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.THEATER_DETAILS.get());
		
		try {
			String query = queryBuilder.buildInsert();
			queryBuilder.execute(query,theater);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	
	}
	public void update(Theater theater) throws MovieException {
		try {
			QueryBuilder queryBuilder = new QueryBuilder(Tables.THEATER_DETAILS.get());
			String query = queryBuilder.where(1).buildUpdate();
			queryBuilder.execute(query, theater);
			
			
		}catch(SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
			
		}
		
	}
	public List<Object> getAllByLocation(int location) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.THEATER_DETAILS.get());
		
		try {
			String query = queryBuilder.where(4).buildSelect();
			return queryBuilder.executeQuery(Theater.class, query,location);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
		
		}
		
		
	}
	public List<Object> getAllByName(String name,int location) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.THEATER_DETAILS.get());
		
		try {
			String query = queryBuilder.where(2,4).buildSelect();
			return queryBuilder.executeQuery(Theater.class, query,name,location);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
		
		}
		
		
	}
	
	public List<Object> getAll() throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.THEATER_DETAILS.get());
		
		try {
			String query = queryBuilder.buildSelect();
			return queryBuilder.executeQuery(Theater.class, query);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
		
		}
		
		
	}
	
	public void getAll(String name) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.THEATER_DETAILS.get());
		
		try {
			String query = queryBuilder.where(1).buildSelect();
			queryBuilder.executeQuery(Theater.class, query,name);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
		
		}
		
		
	}

}
