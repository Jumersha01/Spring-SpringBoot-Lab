package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.commans.*;
import com.nt.config.AppConfig;
import com.nt.sbeans.VehicleService;
public class EngineTest {

	public static void main(String[] args) {
	try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
		
		VehicleService fac = ctx.getBean("vs",VehicleService.class);
   System.out.println(fac.createVehicle("car", "electric"));
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}

}
