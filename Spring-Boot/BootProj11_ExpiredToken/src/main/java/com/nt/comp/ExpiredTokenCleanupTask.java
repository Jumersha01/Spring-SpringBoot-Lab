package com.nt.comp;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExpiredTokenCleanupTask {
  
  @Scheduled(fixedDelay=900000)
  public void cleanupExpiredTokens() throws InterruptedException {
	System.out.println("Cleanup Process Started...");  
	System.out.println("Expired JWT Token 1\n"
			+ "Inactive API Token 2\n"
			+ "Old Authentication Record 3");
	Thread.sleep(2000);
	System.out.println("Expired Records Removed Successfully\nCleanup Completed...");
  }
}
