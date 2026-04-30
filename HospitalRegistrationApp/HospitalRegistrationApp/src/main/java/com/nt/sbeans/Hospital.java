package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hs")
public class Hospital {

	@Value("101")
	private int hospitalId;
	
	@Value("LifeLong Partner")
	private String hospitalName;
	
	@Value("Youvraj")
	private String doctorName;
	
	@Value("500")
	private double consultancyFee;
	
	@Value("true")
	private  boolean emergencyAvailable;
	
	public void registerPatient(String name) {
		System.out.println(name+" Patient Registered: ");
	
	}
	public void showHospitalInfor() {
		System.out.println("Hospital Detals: \n"+"Name: "+this.hospitalName+"\nDoctor name: "+this.doctorName+"\n Hospital Id: "+this.hospitalId+"\n Consultation Fee: "+this.consultancyFee+"\nEmergency Available: "+this.emergencyAvailable);
	}
	
	
}
