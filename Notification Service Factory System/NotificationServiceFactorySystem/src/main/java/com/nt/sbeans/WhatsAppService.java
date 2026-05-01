package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.NotificationService;

@Component("ws")
public class WhatsAppService implements NotificationService {

	@Value("9021248504")
	private String businessNO;
	
	@Value("true")
	private boolean verifiedStatus;
	@Override
	public void sendNotification() {
	System.out.println("Whatsapp message Sent Succussfully");

	}

	@Override
	public void notificationDetails() {
		System.out.println("Busines NO: "+this.businessNO+"\nVerified Status:"+this.verifiedStatus);

	}

}
