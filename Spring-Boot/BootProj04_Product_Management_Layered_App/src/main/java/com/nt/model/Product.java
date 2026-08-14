package com.nt.model;

import lombok.Data;

@Data
public class Product {
  private int productId;
  private String productName;
  private String description;
  private double price;
  
  public Product(int productId, String productName, String description, double price) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.description = description;
	this.price = price;
  }
  
  
	
}
