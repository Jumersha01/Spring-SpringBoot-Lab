package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootProj08DatabaseBackupSchedulerApplication {

	public static void main(String[] args) throws InterruptedException {
		try(ConfigurableApplicationContext ctx =SpringApplication.run(BootProj08DatabaseBackupSchedulerApplication.class, args)){
		
		
			
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

}
