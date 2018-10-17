package com.pearson.webassist.demoservicea.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pearson.webassist.demoservicea.model.Product;
import com.pearson.webassist.demoservicea.repositories.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAllProducts() {
		List<Product> products = productRepository.findAll();
		
        return products;
    }
    public Optional<Product> findProductByCode(String code) {
        return productRepository.findByCode(code);
    }
	
}
