package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.nt.sbeans.ShoppingMonitoring;

@SpringBootApplication
@EnableScheduling
public class BootProj07OnlineShoppingSystemMonitoringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj07OnlineShoppingSystemMonitoringApplication.class, args);

	}

}
