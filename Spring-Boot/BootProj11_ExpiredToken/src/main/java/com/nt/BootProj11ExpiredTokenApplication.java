package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootProj11ExpiredTokenApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx =SpringApplication.run(BootProj11ExpiredTokenApplication.class, args)){
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
