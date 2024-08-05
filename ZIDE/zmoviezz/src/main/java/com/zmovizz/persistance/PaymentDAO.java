//$Id$
package com.zmovizz.persistance;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Payment;
import com.zmovizz.models.Constants.StatusCode;
import com.zmovizz.models.Constants.Tables;
import com.zmovizz.utility.CustomLogger;
import com.zmovizz.utility.QueryBuilder;

public class PaymentDAO {

	public Payment get(Integer payment) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.PAYMENT_DETAILS.get());
		
		try {
			String query = queryBuilder.where(1).buildSelect();
			List<Object> result = queryBuilder.executeQuery(Payment.class, query,payment);
			
			if(result.isEmpty()) {
				throw new MovieException(StatusCode.NOT_FOUND);
			}
			return (Payment)result.get(0);
		} catch (SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
		
		}
	}
	
	public int getId(long time) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.PAYMENT_DETAILS.get());
		
		try {
			String query = queryBuilder.where(5).buildSelect();
			
			List<Object> result = queryBuilder.executeQuery(Payment.class, query,time);
			
			if(result.isEmpty()) {
				throw new MovieException(StatusCode.NOT_FOUND);
			}
			Payment payment = (Payment) result.get(0);
			return payment.getPaymentId();
		} catch (SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
		
		}
	}
	
	
	public void set(Payment payment) throws MovieException {
		QueryBuilder queryBuilder  = new QueryBuilder(Tables.PAYMENT_DETAILS.get());
		
		try {
			String query = queryBuilder.buildInsert();
			queryBuilder.execute(query,payment);
			
		} catch (SQLException e) {
			CustomLogger.log(Level.INFO, e.getMessage(),e);	
			throw new MovieException(StatusCode.SQL_ERROR);
		}
	}

}
