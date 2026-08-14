package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootProj12FraudTransactionDetectionApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj12FraudTransactionDetectionApplication.class, args)){
			Integer a = 10;
			Integer b = 10;
			
			
			int c =  a.intValue();
		
			System.out.println(c==a);
			

		}
		catch(Exception e ) {
		e.printStackTrace();
		}
	}

	

}
