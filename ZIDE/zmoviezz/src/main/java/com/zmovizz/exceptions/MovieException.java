//$Id$
package com.zmovizz.exceptions;

import com.zmovizz.models.Constants.StatusCode;

public class MovieException extends Exception{

	private StatusCode error;
	

	private static final long serialVersionUID = 1L;
	
	public MovieException(String message,Throwable cause) {
		super( message,cause);
	}
	public MovieException( StatusCode error) {
		this.error = error;
	}
	public MovieException( StatusCode error,Throwable cause) {
		super(cause);
		this.error = error;
	}
	
	public StatusCode getError() {
		return this.error;
	}
}
