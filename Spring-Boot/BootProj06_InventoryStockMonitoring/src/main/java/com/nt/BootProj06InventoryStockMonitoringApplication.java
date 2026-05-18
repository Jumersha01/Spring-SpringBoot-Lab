package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.nt.sbeans.Stock;

@SpringBootApplication
@EnableScheduling
public class BootProj06InventoryStockMonitoringApplication {

	public static void main(String[] args) {
	    ConfigurableApplicationContext ctx =SpringApplication.run(BootProj06InventoryStockMonitoringApplication.class, args);
	    Stock st = ctx.getBean(Stock.class);
	    st.monitoring();
	    
	}

}
