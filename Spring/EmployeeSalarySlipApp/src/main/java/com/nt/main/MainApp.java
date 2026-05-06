package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.SalarySlip;

public class MainApp {
	public static void main(String[] args) {
		
	
try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
	SalarySlip slip = ctx.getBean("salslip",SalarySlip.class);
	slip.generateSlip();
}
catch(Exception e) {
	e.printStackTrace();
}
}
}
