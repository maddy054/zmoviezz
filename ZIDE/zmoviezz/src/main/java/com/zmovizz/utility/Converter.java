//$Id$
package com.zmovizz.utility;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;

import com.zmovizz.exceptions.MovieException;
import com.zmovizz.models.Constants.StatusCode;

public class Converter {
	
	public static String getSHA(String input) throws MovieException 
    {
        MessageDigest md;
        
		try {
			md = MessageDigest.getInstance("SHA-256");
			return toHexString( md.digest(input.getBytes(StandardCharsets.UTF_8)));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new MovieException(StatusCode.OTHER_ERROR);
		}
       
    }
     
    public static String toHexString(byte[] hash)
    {
        BigInteger number = new BigInteger(1, hash);
 
        StringBuilder hexString = new StringBuilder(number.toString(16));
 
        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }
 
        return hexString.toString();
    }
    public static long getStartOfDay(long millis) {
    	
    	LocalDate date = LocalDate.ofInstant(Instant.ofEpochMilli(millis), ZoneId.of("Asia/Kolkata"));
    	return  date.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();

    }
    public static long endOfDay(long millis) {
    	
    	LocalDate date = LocalDate.ofInstant(Instant.ofEpochMilli(millis), ZoneId.of("Asia/Kolkata"));
    	return date.plusDays(1).atStartOfDay().toInstant(ZoneOffset.ofHoursMinutes(+5, +30)).toEpochMilli();
    	
    }
}
