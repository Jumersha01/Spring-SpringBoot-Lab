package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Driver {
	@Value("101")
	private int driverId;

	@Value("Shanawaz")
	private String driverName;
	
	@Value("MH-19-AC-1290")
	private String cabNo;
	
	public void driveCab() {
		System.out.println("Driver "+this.driverName+" is Driving cab "+this.cabNo+" whos id is: "+this.driverId);
	}

}
