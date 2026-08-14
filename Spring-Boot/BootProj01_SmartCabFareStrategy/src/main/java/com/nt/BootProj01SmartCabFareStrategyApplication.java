package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.CabBooking;

@SpringBootApplication
@ImportResource("com/nt/comp/applicationContext.xml")
public class BootProj01SmartCabFareStrategyApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(BootProj01SmartCabFareStrategyApplication.class,
				args)) {

			CabBooking cab = ctx.getBean(CabBooking.class);
			cab.bookCab();
			cab.generateBill();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
