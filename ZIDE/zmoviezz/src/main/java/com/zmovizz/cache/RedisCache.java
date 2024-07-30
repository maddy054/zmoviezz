package com.zmovizz.cache;

import redis.clients.jedis.Jedis;

public class RedisCache {
	private static String host = "localhost";
	private static int port = 6379;
   
    public static void set(String key, String value) {
    	
    try(Jedis jedis = new Jedis(host, port)){
    	 jedis.set(key, value);
    	
    }
    	
    }    public static String get(String key) {
    	try(Jedis jedis = new Jedis(host, port)){
    		return jedis.get(key);
    	}
        
    }

    public static void delete(String key) {
    	try(Jedis jedis = new Jedis(host, port)){
    		 jedis.del(key);
    	}
       
    }

}