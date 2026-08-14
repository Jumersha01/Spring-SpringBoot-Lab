package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Product;
import com.nt.repository.IProductRespository;
//this is service class 
@Service
public class IProductServiceImp implements IProductService {
	@Autowired
    private IProductRespository  repository;
	
	@Override
	public void insertProduct(Product product) {
	System.out.println("Product id  before Inserting: "+product.getProductId());	
	 Product pr=	repository.save(product);
	 System.out.print("Product saved with id: "+pr.getProductId());

	}

	@Override
	public Iterable<Product> getAllProduct() {
	        
		return repository.findAll();
	}

	@Override
	public Optional<Product> findProductById(Long id) {
		
		return repository.findById(id);
	}

	@Override
	public void deleteProduct(Long id) {
		repository.deleteById(id);

	}

}
