package com.nt.interceptors;

import java.time.LocalTime;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TimeInterceptor implements HandlerInterceptor {
    
	@Override
	public boolean preHandle(HttpServletRequest request ,HttpServletResponse response,Object hanlder) {
		LocalTime ltime = LocalTime.now();
		int h = ltime.getHour();
		if(h<18) {
		   System.out.println("Website is under the maintenance..");
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/");
			return false;
		
		}
		return true;
	}
	
}
