package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Products_Details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	//This is the Entity class
	@Id
	private Long productId;
	private String productName;
	private String description;
	private Double price;

}
