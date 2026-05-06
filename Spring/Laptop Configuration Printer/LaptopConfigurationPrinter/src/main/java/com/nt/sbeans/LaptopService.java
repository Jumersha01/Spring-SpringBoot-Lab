package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("laptopService")
public class LaptopService {
 
	@Autowired
	Laptop laptop;
	public void printLaptopDetails() {
		System.out.println("Laptop Breand: "+this.laptop.brand+"\nProcessor: "+this.laptop.processor+"\nRam: "+this.laptop.ram);

	}
}
