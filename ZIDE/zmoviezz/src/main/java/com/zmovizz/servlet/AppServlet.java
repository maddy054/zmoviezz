//$Id$
package com.zmovizz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class AppServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 response.setContentType("application/json");
	     response.setHeader("Access-Control-Allow-Origin", "*");
	     response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
	     response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, APIKEY");
	        
		HttpSession session = request.getSession(false);
	    System.out.println(session.getId());
		String path = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(path);
		Cookie jsessionidCookie = new Cookie("JSESSIONID", session.getId());
		jsessionidCookie.setPath("/");
		// Do not set HttpOnly flag
		response.addCookie(jsessionidCookie);

		
		if (!path.startsWith("/api") && !path.startsWith("/app/ember") && !path.startsWith("/ember-fetch") && !path.startsWith("ember/tests") && 
				
	            !path.startsWith("/favicon.ico") && !path.startsWith("/robots.txt") && !path.endsWith("/index.jsp")) {
	     	
			
			request.getRequestDispatcher("/index.jsp").forward(request, response);
	   }	
		
		
		
		
	}
	

}
