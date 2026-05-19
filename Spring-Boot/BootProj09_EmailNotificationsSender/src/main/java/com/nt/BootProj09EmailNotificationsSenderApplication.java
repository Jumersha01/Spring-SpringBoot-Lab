package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class BootProj09EmailNotificationsSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj09EmailNotificationsSenderApplication.class, args);
	}
	
	@Scheduled(fixedDelay=60000)
	public void sendNotification() throws InterruptedException {
		for(int i =1;i<=5;i++) {
			System.out.println("Sending Email: "+i);
		}
		Thread.sleep(2000);
		System.out.println("All Emails Sent Succesfully\nEmail Sending Completed");
	}

}
