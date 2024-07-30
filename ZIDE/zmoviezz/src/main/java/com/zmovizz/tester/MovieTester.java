//$Id$
package com.zmovizz.tester;

import com.zmovizz.cache.RedisCache;

public class MovieTester {

	public static void main(String[] args){
		
			
		RedisCache cache = new  RedisCache();
		cache.set("id", "729637");
		System.out.println(cache.get("id"));
	}
}
