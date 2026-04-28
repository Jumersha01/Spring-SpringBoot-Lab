package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop {
	String brand;
	String processor;
	String ram;
	public Laptop() {
		super();
		this.brand = "Dell";
		this.processor = "intel i3";
		this.ram =  "8 GB";
	}
	

}
