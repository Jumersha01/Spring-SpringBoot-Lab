package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.PaymentProcessor;

public class MainApp {

	public static void main (String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
			PaymentProcessor ps = ctx.getBean("pp",PaymentProcessor.class);
			
			ps.paymentService.pay(12000);
		}
	}
}
