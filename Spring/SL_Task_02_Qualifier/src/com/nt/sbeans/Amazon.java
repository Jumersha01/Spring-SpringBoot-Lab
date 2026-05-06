package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("amz")
public class Amazon implements OttProvider {
  @Override
	public void subscription() {
		System.out.println("Subscribed Amazon");
	}
	
}
