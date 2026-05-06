package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.GroceryStore;

public class GroceryTest {
public static void main(String[] args) {
	try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
		GroceryStore store = ctx.getBean("gs",GroceryStore.class);
		
		store.showStoreDetails();
		System.out.println("=============\n"+store.calculateDiscount(5000));
	}
}
	

}
