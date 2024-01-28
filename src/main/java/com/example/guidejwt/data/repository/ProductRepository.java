package com.example.guidejwt.data.repository;

import com.example.guidejwt.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
