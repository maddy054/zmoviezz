//$Id$
package com.zmovizz.utility;

public class Checker {
	
	public static boolean checkNull(Object object) {
		return object == null;
	}
	
	public static boolean checkLength(String name,int length){
		return name.length() >= length;
	}

}
