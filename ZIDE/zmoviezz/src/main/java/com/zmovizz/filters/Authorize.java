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
        
//        String[] path = request.getRequestURI().split("/");
//        System.out.println(request.getRequestURI());
//        
//        if((path.length<=2 )||( path.length>2 && !path[2].equals("api"))) {
//       	 
//       
//        HttpSession session = request.getSession(false);
//       
//        
//        }
        
//        
//        String path = request.getRequestURI().substring(request.getContextPath().length());
//        if (!path.startsWith("/assets") && !path.startsWith("/ember-fetch") && !path.startsWith("/tests") && 
//                !path.startsWith("/favicon.ico") && !path.startsWith("/robots.txt")) {
//       	 
//                httpRequest.getRequestDispatcher("index.html").forward(httpRequest, httpResponse);
//            } else {
//                chain.doFilter(request, response);
//            }
	}
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}
	@Override
	public void destroy() {
		
		
	}

}
