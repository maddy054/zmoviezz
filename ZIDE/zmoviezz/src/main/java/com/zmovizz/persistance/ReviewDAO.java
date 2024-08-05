//$Id$
package com.zmovizz.persistance;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Constants.Tables;
import com.zmovizz.models.Review;
import com.zmovizz.utility.CustomLogger;
import com.zmovizz.utility.QueryBuilder;


public class ReviewDAO {
	
	public Review get(Integer id) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.REVIEWS.get());
		
		try {
			String query = queryBuilder.buildInsert();
		 List<Object> result = queryBuilder.executeQuery(Review.class,query, id);
		 if(result.isEmpty()) {
			 throw new MovieException(StatusCode.NOT_FOUND);
		 }
		 return (Review) result.get(0);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}	
		
	}
	
	public void set(Review review) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.REVIEWS.get());
		
		try {
			String query = queryBuilder.buildInsert();
			queryBuilder.execute(query, review);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	}

	public List<Object> getAll(int targetValue,int target) throws MovieException {
		
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.REVIEWS.get());
		
		try {
			String query = queryBuilder.where(2,6).buildSelect();
			return queryBuilder.executeQuery(Review.class,query, targetValue,target);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
			
		}
		
	}

}
