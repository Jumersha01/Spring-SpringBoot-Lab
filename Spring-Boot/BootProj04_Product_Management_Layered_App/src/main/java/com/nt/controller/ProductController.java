package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Product;
import com.nt.service.ProductService;

@Controller("controll")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	public void addProduct(Product product) throws Exception {
		service.addProduct(product);
	}
	public List<Product> retrieveAllProducts() throws Exception{
		List<Product> products = service.retrieveAllProducts();
		return products;
	}
	
	public void deleteProduct(int id) throws Exception {
	service.deleteProduct(id);
	}
	
	public void updateProduct(Product product) throws Exception{
		service.updateProduct(product);
	}
    

}
