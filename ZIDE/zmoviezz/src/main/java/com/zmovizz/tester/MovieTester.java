//$Id$
package com.zmovizz.tester;

import com.zmovizz.cache.RedisCache;
import com.zmovizz.exceptions.MovieException;
import com.zmovizz.utility.Converter;

public class MovieTester {

	public static void main(String[] args) throws MovieException{
		
			System.out.println(	Converter.getSHA("Sanjey@123"));
			System.out.println(	Converter.getSHA("Stalin@123"));
	
	
	}
}
