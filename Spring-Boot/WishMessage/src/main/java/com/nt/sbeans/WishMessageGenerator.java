package com.nt.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {
	
	@Autowired
	LocalTime time;
	
	public void getMessage(String user) {
	 int hour = time.getHour();
	 if(hour<=12) {
		 System.out.println("Good Mornig "+user);
	 }
	 else if(hour>12) {
		 System.out.println("Good Evening "+user);
	 }
	 
	}

}
