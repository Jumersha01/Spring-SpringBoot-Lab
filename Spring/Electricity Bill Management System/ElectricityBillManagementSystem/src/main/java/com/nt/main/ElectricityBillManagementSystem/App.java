package com.nt.main.ElectricityBillManagementSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.ElectricityBill;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
        	
        	ElectricityBill bill = ctx.getBean("bill",ElectricityBill.class);
            bill.calculateBill();
            bill.consumerDetails();
        }
    }
}
