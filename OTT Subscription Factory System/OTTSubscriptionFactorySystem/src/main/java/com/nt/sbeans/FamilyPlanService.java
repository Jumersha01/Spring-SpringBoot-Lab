package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.SubscriptionService;

@Component("fps")
public class FamilyPlanService implements SubscriptionService {

	@Value("10")
	private int maxMembers;

	@Value("true")
	private boolean parentalControl;

	@Override
	public void activatePlane() {
		System.out.println("Your family plane has been activated");

	}

	@Override
	public void showPlaneDetails() {

		System.out.println(
				"Plan Details:\nMax member:" + this.maxMembers + "\nParental control: " + this.parentalControl);
	}

}
