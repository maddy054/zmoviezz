//$Id$
package com.zmovizz.persistance;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Movie;
import com.zmovizz.models.Constants.Tables;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.utility.CustomLogger;
import com.zmovizz.utility.QueryBuilder;

public class MovieDAO {
	
	public Object get(Integer movieId) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.MOVIE_DETAILS.get());
		
		try {
			String query = queryBuilder.where(1).buildSelect();
			List<Object> result = queryBuilder.executeQuery(Movie.class,query, movieId);
			
		      if(result.isEmpty()) {
		    	  
				throw new MovieException(StatusCode.NOT_FOUND);
			}
		      return result.get(0);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
			
		}
		
	}
	
	public void set(Movie movie) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.MOVIE_DETAILS.get());
		
		try {
			String query = queryBuilder.buildInsert();
			queryBuilder.execute(query, movie);
				
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
			
		}
		
	}
	public void update(Movie movie) throws MovieException {
		
		try {
			QueryBuilder queryBuilder = new QueryBuilder(Tables.MOVIE_DETAILS.get());
			String query = queryBuilder.buildInsert();
			queryBuilder.execute(query, movie);
			
			
		}catch(SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
		
	}
	
//	public void getAll(String name) throws MovieException {
//		
//		try {
//			QueryBuilder queryBuilder = new QueryBuilder(Tables.MOVIE_DETAILS.get());
//			String query = queryBuilder.column(1,2).where(2).buildSelect();
//			List<Object> result = queryBuilder.executeQuery(Movie.class, query, name);
//			
//		}catch(SQLException e) {
//			CustomLogger.log(Level.INFO, e.getMessage(),e);
//			throw new MovieException(StatusCode.SQL_ERROR);
//		}
//	}
	
	
	
	public List<Object> getAll(Integer theater) throws MovieException {
		try {
			QueryBuilder queryBuilder = new QueryBuilder(Tables.SHOW_DETAILS.get(),Tables.MOVIE_DETAILS.get());
			String query = queryBuilder.join(4,1).where(4).between(2,1).buildSelect();
			long currTime = System.currentTimeMillis();
			long millisPerDay = 86400000l;
			return queryBuilder.executeQuery(Movie.class, query, theater,currTime,currTime+millisPerDay);
			
		}catch(SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
			
		}
	}
	
}
