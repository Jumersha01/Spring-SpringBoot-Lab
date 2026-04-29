package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("gs")
public class GroceryStore
{
@Value("101")	
private int storeId;

@Value("Panchali")
private String storName;

@Value("Savda")
private String location;

@Value("5")
private double discountPercentAage;

@Value("true")
private boolean homeDeliveryAvailable;

public int getStoreId() {
	return storeId;
}

public String getStorName() {
	return storName;
}

public String getLocation() {
	return location;
}

public double getDiscountPercentAage() {
	return discountPercentAage;
}

public boolean isHomeDeliveryAvailable() {
	return homeDeliveryAvailable;
}

public void showStoreDetails() {
	System.out.println("Store Details=> \n"+"Store name: "+this.storName+"\nStore id: "+this.storeId+"\nStore location: "+this.location+"\n Discount percentage: "+this.discountPercentAage+"\nHome delivery: "+this.homeDeliveryAvailable);
}

public double calculateDiscount(double amount) {
	return (amount/100)*this.discountPercentAage;
			
}


}
