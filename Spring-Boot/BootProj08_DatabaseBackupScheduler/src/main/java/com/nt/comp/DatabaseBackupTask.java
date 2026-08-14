package com.nt.comp;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DatabaseBackupTask {

	@Scheduled(fixedDelay=30000)
	public void backupDatabase() throws InterruptedException {
		System.out.println("Application stareted\n\n");
		System.out.println("Database Backup Started...");
		System.out.println("Backing up Users Table..\n"
				+ "Backing up Products Table..\n"
				+ "Backing up Orders Table..\n"
				+ "Backing up Payments Table...n"
				+ "Backing up Customers Table..."
			);
		Thread.sleep(2000);
		
		
	}
}
