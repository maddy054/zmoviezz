//$Id$
package com.zmovizz.persistance;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.User;
import com.zmovizz.models.Constants.Tables;
import com.zmovizz.models.Constants.UserRole;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.utility.CustomLogger;
import com.zmovizz.utility.QueryBuilder;

public class UserDAO {
	
	public User get(Integer userId) throws MovieException {
		
		try {
			
			QueryBuilder queryBuilder = new QueryBuilder(Tables.USER_DETAILS.get());
			
			String query = queryBuilder.where(1).buildSelect();
			List<Object> result = queryBuilder.executeQuery(User.class,query,userId);
			if(result.isEmpty()) {
				throw new MovieException( StatusCode.NOT_FOUND);
			}
			User user = (User)result.get(0);
			user.setPassword("");
			 return user;
		
		} catch (SQLException e) {
			CustomLogger.log(Level.WARNING, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
		
		
	}

	public void set(User user) throws MovieException {
		try {

			QueryBuilder queryBuilder = new QueryBuilder(Tables.USER_DETAILS.get());
			String query = queryBuilder.buildInsert();
			queryBuilder.execute(query, user);
			
			
		}catch(SQLException e) {
			CustomLogger.log(Level.WARNING, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	}
	
	public void update(User user) throws MovieException {
		try {
			
			QueryBuilder queryBuilder = new QueryBuilder(Tables.USER_DETAILS.get());
			String query = queryBuilder.where(1).buildUpdate();
			queryBuilder.execute(query, user);
			
		}catch(SQLException e) {
			CustomLogger.log(Level.WARNING, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	}
	
	public List<Object> getAll() throws MovieException {
		
		try {
			QueryBuilder queryBuilder = new QueryBuilder(Tables.USER_DETAILS.get());
			String query = queryBuilder.column(1,3,4,5,6).buildSelect();
			return queryBuilder.executeQuery(User.class,query);
			
			
		}catch(SQLException e) {
			CustomLogger.log(Level.WARNING, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	}
	
	public UserRole validateUser(int userId, String password) throws MovieException {
		
		
		try {
			QueryBuilder queryBuilder = new QueryBuilder(Tables.USER_DETAILS.get());
			String query = queryBuilder.where(1,2).buildSelect();
			List<Object> result = queryBuilder.executeQuery(User.class,query,userId,password);
			if(result == null || result.size() == 0) {
				throw new MovieException(StatusCode.NOT_FOUND);
			}
			User user = (User)result.get(0);
			return user.getRole();
			 
		}catch(SQLException e) {
			CustomLogger.log(Level.WARNING, e.getMessage(),e);
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	}
}
