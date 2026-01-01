package com.example.Product.Details.repository;


import com.example.Product.Details.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository <Product,Long> {
        Product findByid(Long id);
}
