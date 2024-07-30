//$Id$
package com.zmovizz.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class Authorize implements Filter {

	

	@Override
	public void doFilter(ServletRequest httpRequest, ServletResponse httpResponse, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) httpRequest;
        HttpServletResponse response = (HttpServletResponse) httpResponse;
        response.setHeader("Cache-Control","no-cache"); 
        response.setHeader("Cache-Control","no-store"); 
        response.setDateHeader("Expires", 0); 
        response.setHeader("Pragma","no-cache");
        
        
        String[] path = request.getRequestURI().split("/");
         HttpSession session = request.getSession(false);
         String sessionId =null;
         
//         if(!(path.length >= 6 && path[5].equals("login"))) {
//        	 
//        	if(session == null) {
//        		redirect(response);
//           	 	return;
//        	}
//        	if(!(path.length>=4 && path[3].equals("session"))) {
//        	 
//      
//        		sessionId = session.getId();
//        		if(sessionId == null) {
//        			redirect(response);
//        			return;
//        		}
//        		String objString = RedisCache.get(sessionId);
//        		System.out.println(objString);
//        		try {
//        			JSONConverter.getJsonObj(objString);
//        		} catch (MovieException e) {
//		
//        			e.printStackTrace();
//        		}
//      
//        	}
//      }
//        
     chain.doFilter(request, response);


	}
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}
	@Override
	public void destroy() {
		
		
	}
	
	private void redirect(HttpServletResponse response) throws IOException {
		response.sendRedirect("/zmoviezz/login");
		
	}


}
