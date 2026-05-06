package com.nt.main.OnlineCabBookingFareSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.CabService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
        	CabService cab = ctx.getBean("cab",CabService.class);
        	cab.calculateFare(150);
        	cab.showCabDetails();
        }
    }
}
