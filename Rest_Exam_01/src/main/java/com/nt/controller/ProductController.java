package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Product;
import com.nt.service.IProductServiceImp;

@RestController
@RequestMapping("/product-api")
public class ProductController {
	
	@Autowired
	private IProductServiceImp service;
	
	@PostMapping("/product")
	public String add(@RequestBody Product product) {
		String message = service.addProduct(product);
		 return message;
	}
	
	@GetMapping("/product")
	ResponseEntity<List<Product>> getAllProducts(){
		List<Product> productList = service.getAllProducts();
		return new  ResponseEntity<List<Product>>(productList,HttpStatus.OK);
	}
	
	@GetMapping("product/{id}")
	ResponseEntity<Product> getPruductById(@PathVariable Long id){
		Product pr = service.getProductById(id);
		return new ResponseEntity<Product> (pr,HttpStatus.OK);
	}
	
	@PutMapping("/product/{id}")
	String updateProduct(@PathVariable Long id,@RequestBody Product product) {
		String message = service.updateProduct(id, product);
		return message;
	}
	
	@DeleteMapping("product/{id}")
	String deleteProduct(@PathVariable Long id ) {
		String message = service.deletProduct(id);
		return message;
	}
	
	

}
