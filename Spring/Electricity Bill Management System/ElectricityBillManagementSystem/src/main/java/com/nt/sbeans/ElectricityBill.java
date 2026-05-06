package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bill")
public class ElectricityBill {
    @Value("${con.id}")
	private int consumerId;
    
    @Value("${con.name}")
    private String name;
    
    @Value("${unit.consumed}")
    private double unitConsumed;
    
    @Value("${rate.unit}")
    private double ratePerUnit;
    
    @Value("${surchar}")
    private double surchage;
    
    public void calculateBill() {
    	System.out.println("Your bill is: "+(this.unitConsumed*this.ratePerUnit));
    }
    
    public void consumerDetails() {
    	System.out.println("Consumer Details:\nConsumer id: "+this.consumerId+"\nConsumer Name: "+this.name+"\nConsumed Unit:"+this.unitConsumed);
    }
	
	
}
