package com.nt.CabBookingSystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Driver;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
    	   Driver d1 = ctx.getBean(Driver.class);
    	   Driver d2 = ctx.getBean(Driver.class);
    	   
    	   List<Driver> dlist = new ArrayList<>();
    	   dlist.add(d1);
    	   dlist.add(d2);
    	   for(Driver d :dlist) {
    		   System.out.println(d.hashCode());
    	   }
    	   
    	   
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
