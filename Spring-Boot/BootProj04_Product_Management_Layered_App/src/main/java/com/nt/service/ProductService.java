package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Product;
import com.nt.repository.ProductDAO;

@Service("pservice")
public class ProductService {

	@Autowired
	ProductDAO dao;
	
	public void addProduct(Product product) throws Exception {
		dao.insertPorduct(product);
	}
	
	public List<Product> retrieveAllProducts() throws Exception{
		List<Product> list=dao.retriveAllProduct();
		return list;
	}
	
	public void deleteProduct(int id) throws Exception {
		dao.deleteProduct(id);
	}
	
	public void updateProduct(Product product) throws Exception{
		dao.updateProduct(product);
	}
	
}
