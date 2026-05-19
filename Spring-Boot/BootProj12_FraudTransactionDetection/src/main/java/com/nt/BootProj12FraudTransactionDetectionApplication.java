package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.nt.comp.Transaction;

@SpringBootApplication
@EnableScheduling
public class BootProj12FraudTransactionDetectionApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj12FraudTransactionDetectionApplication.class, args)){
			

		}
		catch(Exception e ) {
		e.printStackTrace();
		}
	}

	

}
