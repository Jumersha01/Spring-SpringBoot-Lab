package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootProj10LargeFileProcessingApplication {

	public static void main(String[] args) {
	    ConfigurableApplicationContext ctx = SpringApplication.run(BootProj10LargeFileProcessingApplication.class, args);
	}

}
