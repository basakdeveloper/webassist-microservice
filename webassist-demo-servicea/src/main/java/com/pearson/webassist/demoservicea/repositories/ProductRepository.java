package com.pearson.webassist.demoservicea.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pearson.webassist.demoservicea.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByCode(String code);
}
