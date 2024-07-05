package com.zmoviezz.cache;

import redis.clients.jedis.Jedis;

public class RedisCache {
    private Jedis jedis;
    private String host = "localhost";
    private int port = 6379;
    
    public void setPort(int port) {
    	this.port = port;
    }
    
    public void setHost(String host) {
    	this.host = host;
    }
    public RedisCache() {
        jedis = new Jedis(host, port);
    }

    public void set(String key, String value) {
    	
        jedis.set(key, value);
        jedis.close();
       
    }

    public String get(String key) {
        return jedis.get(key);
    }

    public void delete(String key) {
        jedis.del(key);
    }

    public void close() {
        if (jedis != null) {
            jedis.close();
        }
    }
}