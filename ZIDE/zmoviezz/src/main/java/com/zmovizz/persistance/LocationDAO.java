//$Id$
package com.zmovizz.persistance;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Location;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Constants.Tables;
import com.zmovizz.utility.CustomLogger;
import com.zmovizz.utility.QueryBuilder;

public class LocationDAO {

	public Location get(Integer id) throws MovieException {
		
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.LOCATIONS.get());
		
		try {
			String query = queryBuilder.where(1).buildSelect();
			List<Object> result = queryBuilder.executeQuery(Location.class, query, id);
			
			if(result.isEmpty()) {
				throw new MovieException(StatusCode.NOT_FOUND);
			}
			return (Location)result.get(0);
			
		} catch (SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	}
	
	
	public void update(Location location) throws MovieException {
		
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.LOCATIONS.get());
		
		try {
			String query = queryBuilder.where(1).buildUpdate();
			queryBuilder.execute(query, location);
			
		} catch (SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
			
		}
	}
	
	public void set(Location location) throws MovieException {
		System.out.println(Tables.LOCATIONS.get());
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.LOCATIONS.get());
		
		try {
			String query = queryBuilder.buildInsert();
			queryBuilder.execute(query, location);
			
		} catch (SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
			
		}
	}
	public List<Object> getAll() throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.LOCATIONS.get());
		
		try {
			String query = queryBuilder.buildSelect();
			return queryBuilder.executeQuery(Location.class, query);
		
			
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	
	}

	public List<Object> getAll(String name) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.LOCATIONS.get());
		
		try {
			String query = queryBuilder.where(2).buildSelect();
			return queryBuilder.executeQuery(Location.class, query, name);
		
			
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	
	}

}
