package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class BootProj13EveryMinuteUsingCronApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootProj13EveryMinuteUsingCronApplication.class, args); 
			
		
	}
	
	@Scheduled(cron=" 0 0 9 15 * 1-5")
	public void executingEveryMin() {
		System.out.println("Executing");
	}
	

}
