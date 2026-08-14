package com.nt.comp;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LargeFileProcessor {
	@Scheduled(initialDelay=15000,fixedDelay=600000)
	public void processingLargeFile() throws InterruptedException {
     System.out.println("Large File Processing Started...");
       System.out.println("Processing report.csv\n"
       		+ "Processing employees.xlsx\n"
       		+ "Processing documents.pdf");
       Thread.sleep(3000);
       System.out.println("All Files Processed Successfully\n"
       		+ "\"Large File Processing Completed...\n"
       		+ "\n"
       		+ "Completed..");
	}
}
