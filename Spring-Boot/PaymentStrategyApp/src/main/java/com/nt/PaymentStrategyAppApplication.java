package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.PaymentService;

@SpringBootApplication
public class PaymentStrategyAppApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx =SpringApplication.run(PaymentStrategyAppApplication.class, args)){
			PaymentService service =ctx.getBean(PaymentService.class);
			service.makePayment("upi", 24000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
