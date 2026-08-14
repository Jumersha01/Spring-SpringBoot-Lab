package com.nt.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.entity.Product;
import com.nt.service.IProductServiceImp;

@Controller
public class IProductController {
   @Autowired
  private IProductServiceImp service;
  //this is the controller class
   public void inserProduct(Product product) {
	   service.insertProduct(product);
   }
   
   public Iterable<Product> retrieveAllProducts() {
       
		return service.getAllProduct();
	}


	public Optional<Product> findProductById(Long id) {
		
		return service.findProductById(id);
	}

	
	public void deleteProductById(Long id) {
		service.deleteProduct(id);

	}
   
}
