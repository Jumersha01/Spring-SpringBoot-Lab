package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Product;
import com.nt.repository.IProductRepository;

@Service
public class IProductServiceImp implements IProductService {

	@Autowired
	private IProductRepository repo;

	@Override
	public String addProduct(Product product) {
		Long id = repo.save(product).getId();
		return "Product is saved with id: " + id;
	}

	@Override
	public List<Product> getAllProducts() {

		List<Product> productList = repo.findAll();
		return productList;
	}

	@Override
	public Product getProductById(Long id) {

		Optional<Product> productContainer = repo.findById(id);
		Product pr = null;
		if (productContainer.isPresent()) {
			return productContainer.get();
		} else {
			return pr;
		}
	}

	@Override
	public String updateProduct(Long id, Product Product) {

		String message = null;
		Optional<Product> productContainer = repo.findById(id);
		Product updateProduct = null;

		if (productContainer.isPresent()) {
			updateProduct = productContainer.get();
			updateProduct.setName(Product.getName());
			updateProduct.setBrand(Product.getBrand());
			updateProduct.setCategory(Product.getCategory());
			repo.save(updateProduct);
			message = "Product is updated with id: " + id;
		} else {
			message = "Product with " + id + "Not found";
		}

		return "message";
	}

	@Override
	public String deletProduct(Long id) {
		String message = null;
		Optional<Product> productContainer = repo.findById(id);
		if (productContainer.isPresent()) {
			repo.delete(productContainer.get());
			message = "Product with id " + id + " is Deleted";
		}

		else {
			message = "Product not found to deleted";
		}

		return message;
	}

}
