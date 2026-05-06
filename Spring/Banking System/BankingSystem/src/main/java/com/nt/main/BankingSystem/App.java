package com.nt.main.BankingSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Customer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
        	Customer customer = ctx.getBean("cs",Customer.class);
        	
        	customer.setCustomerId(101);
        	customer.setCustomerName("Junaid");
        	customer.setBank("sbi");
        	customer.deposit(50000);
        	customer.withdraw(5000);
        	customer.displayDetails();
        }
    }
}
