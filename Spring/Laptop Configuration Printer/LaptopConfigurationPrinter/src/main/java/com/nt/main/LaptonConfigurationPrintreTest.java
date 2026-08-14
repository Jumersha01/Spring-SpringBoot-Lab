package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.LaptopService;

public class LaptonConfigurationPrintreTest {
public static void main(String[] args) {
	try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
		LaptopService laptopService = ctx.getBean("laptopService",LaptopService.class);
		laptopService.printLaptopDetails();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
