package com.nt.OnlineFoodDeliverySystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Customer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext ctx  = new AnnotationConfigApplicationContext(AppConfig.class)){
    	   Customer cust = ctx.getBean("cust",Customer.class);
    	   Customer cust2= ctx.getBean("cust",Customer.class);
    	   
    	   System.out.println(cust.service.hashCode()==cust2.service.hashCode());
    	   
    	   cust.placeOrder();
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
