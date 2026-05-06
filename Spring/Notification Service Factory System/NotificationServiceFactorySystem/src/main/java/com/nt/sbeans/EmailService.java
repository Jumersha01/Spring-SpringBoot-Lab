package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.NotificationService;
@Component("es")
public class EmailService implements NotificationService {
   
	@Value("junaid555fakir@gmail.com")
	private String senderEmail;
	
	@Value("Tomcat:Local")
	private String smtpServer;
	@Override
	public void sendNotification() {
		System.out.println("Email sent SuccesFully.");

	}

	@Override
	public void notificationDetails() {
	System.out.println("Sender email: "+this.senderEmail+"\nServer: "+this.smtpServer);

	}

}
