package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.SubscriptionService;

@Component("bps")
public class BasicPlanService implements SubscriptionService {

	
	@Value("399")
	private double monthltyPrice;
	
	@Value("1080P")
	private String videoQuality;
	
	@Override
	public void activatePlane() {
		System.out.println("Basic Plane is activated");

	}

	@Override
	public void showPlaneDetails() {
		System.out.println("Place Details:\nPrice: "+this.monthltyPrice+"\nVideo Quality: "+this.videoQuality);

	}

}
