package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.InvoiceService;

public class InvoiceTester {

	public static void main(String[] args) {
	try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
	 InvoiceService service	 = ctx.getBean("is",InvoiceService.class);
	 service.printInvoice();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
		
	}

}
