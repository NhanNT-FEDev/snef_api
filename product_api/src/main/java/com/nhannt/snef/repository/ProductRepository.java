package com.nhannt.snef.repository;

import com.nhannt.snef.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
