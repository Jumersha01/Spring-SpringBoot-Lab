package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.NotificationService;

@Component("smss")
public class SMSService implements NotificationService {

	@Value("Junaid")
	private String providerName;
	
	@Value("100")
	private int smsLimit;
	
	@Override
	public void sendNotification() {
		System.out.println("SMS sent Succesfully.");

	}

	@Override
	public void notificationDetails() {
		System.out.println("Provide Name:"+this.providerName+"\nSMS Limit: "+this.smsLimit);

	}

}
