package com.nt.comp;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FraudDetectionTask {
	Transaction transactions[] = {
			
			new Transaction("TX101",25000,"SUCCESS"),
			new Transaction("TX102",85000,"PENDING"),
			new Transaction("TX103",15000,"SUCCESS"),
			new Transaction("TX104",92000,"PENDING"),
			new Transaction("TX105",45000,"PENDING")
			
	};
   
	@Scheduled(fixedDelay = 900000)
	public void detectFraudTransactions() throws InterruptedException {
		

		int fraudDetection = 0;
		for(Transaction transaction:this.transactions) {
			System.out.println("Checking Transaction: "+transaction.getTransactionId());
			if((transaction.getAmount()>50000)&&(transaction.getStatus().equals("PENDING"))) {
				
				System.out.println("fraud alert for: "+transaction.getTransactionId());
				fraudDetection++;
			}
		}
		Thread.sleep(2000);
		System.out.println("Fraud Detection Completed\r\n"
				+ "Total Suspicious Transactions :"+fraudDetection);
	}
}
