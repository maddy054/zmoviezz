//$Id$
package com.zmovizz.persistance;

import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import java.util.logging.Level;

import com.zmovizz.models.Show;
import com.zmovizz.models.Theater;
import com.zmovizz.models.Ticket;
import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Constants.Tables;
import com.zmovizz.utility.CustomLogger;
import com.zmovizz.utility.QueryBuilder;

public class ShowDAO {
	
	public Show get(Integer showId) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.SHOW_DETAILS.get());
		
		try {
			String query = queryBuilder.where(1).buildSelect();
			List<Object> result = queryBuilder.executeQuery(Show.class,query,showId);
			if(result.isEmpty()) {
				throw new MovieException(StatusCode.NOT_FOUND);
			}
			return (Show) result.get(0);
		} catch (SQLException e) {
			CustomLogger.log(Level.WARNING, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	}
	
	public void set(Show show) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.SHOW_DETAILS.get());
		
		try {
			String query = queryBuilder.buildInsert();
			queryBuilder.execute(query, show);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.WARNING, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
			
		}
		
	}
	
	public void update(Show show) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.SHOW_DETAILS.get());
		
		try {
			
			String query = queryBuilder.where(1).buildUpdate();
			queryBuilder.execute(query,show);
			
		} catch (SQLException e) {
			CustomLogger.log(Level.WARNING, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
		
	}
	public List<Object> getAll(int theater,long time) throws MovieException {
		try {
			
			QueryBuilder queryBuilder = new QueryBuilder(Tables.SHOW_DETAILS.get(),Tables.MOVIE_DETAILS.get());
			String query = queryBuilder.join(4,1).where(5,7).between(2).buildSelect();
			
			LocalDate date = LocalDate.ofInstant(Instant.ofEpochMilli(time), ZoneId.of("Asia/Kolkata"));

			long endOfDay = date.plusDays(1).atStartOfDay().toInstant(ZoneOffset.ofHoursMinutes(+5, +30)).toEpochMilli();
			
			
			return  queryBuilder.executeQuery(Show.class, query, 0,theater,time,endOfDay);
			
		}catch(SQLException e) {
			CustomLogger.log(Level.WARNING, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	
	}
	
	public List<Object> getByTime(int theater,long startTime,long endTime) throws MovieException{
		
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.SHOW_DETAILS.get());
		
		try {
			String query = queryBuilder.where(7).between(2).buildSelect();
			return queryBuilder.executeQuery(Show.class, query,theater,startTime,endTime);
		} catch (SQLException e) {
			
			CustomLogger.log(Level.INFO, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		
		}
	}
	public List<Object> getAllForMovie(int movie ,int location,long time) throws MovieException {
		try {
			
			QueryBuilder queryBuilder = new QueryBuilder(Tables.THEATER_DETAILS.get(),Tables.SHOW_DETAILS.get());
			String query = queryBuilder.join(1,7).where(4,5).between(2).table(2).buildSelect();
			
			LocalDate date = LocalDate.ofInstant(Instant.ofEpochMilli(time), ZoneId.of("Asia/Kolkata"));

			long endOfDay = date.plusDays(1).atStartOfDay().toInstant(ZoneOffset.ofHoursMinutes(+5, +30)).toEpochMilli();
			
			
			return  queryBuilder.executeQuery(Theater.class, query,movie,0,time,endOfDay);
			
		}catch(SQLException e) {
			CustomLogger.log(Level.WARNING, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	
	}
	
	
	
	
}
