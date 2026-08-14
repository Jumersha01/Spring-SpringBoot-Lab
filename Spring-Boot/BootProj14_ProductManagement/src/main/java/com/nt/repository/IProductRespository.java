package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Product;
//This is the repositroy interface
public interface IProductRespository extends CrudRepository<Product, Long> {

}
