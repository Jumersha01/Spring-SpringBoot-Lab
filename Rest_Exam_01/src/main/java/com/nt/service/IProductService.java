package com.nt.service;

import java.util.List;

import com.nt.entity.Product;

public interface IProductService {
	
   String addProduct(Product product);
   
   List<Product> getAllProducts();
   
   Product getProductById(Long id);
   
   String updateProduct(Long id,Product Product);
   
   String deletProduct(Long id);
   
   
}
