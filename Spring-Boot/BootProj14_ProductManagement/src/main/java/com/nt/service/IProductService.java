package com.nt.service;

import java.util.Optional;

import com.nt.entity.Product;

public interface IProductService {
  void insertProduct(Product product);
  Iterable<Product> getAllProduct();
  Optional<Product> findProductById(Long id);
  void deleteProduct(Long id);
}
