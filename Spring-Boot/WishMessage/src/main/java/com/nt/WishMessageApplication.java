package com.nt;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class WishMessageApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(WishMessageApplication.class, args);
		WishMessageGenerator gen = ctx.getBean(WishMessageGenerator.class);
		gen.getMessage("Junaid");

	  }
	
	@Bean("ldate")
	public LocalTime getTime() {
		return LocalTime.now();
	}

}
