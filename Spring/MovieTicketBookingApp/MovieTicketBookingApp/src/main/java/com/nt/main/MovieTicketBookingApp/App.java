package com.nt.main.MovieTicketBookingApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.MovieTheater;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
    	MovieTheater theater = ctx.getBean("mt",MovieTheater.class);
    	
    	theater.showMovieDetails();
    	System.out.println(theater.bookTickets(3));
      }
    }
}
