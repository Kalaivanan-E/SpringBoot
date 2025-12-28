package com.example.Product.Details.service;

import com.example.Product.Details.dto.ProductDto;
import com.example.Product.Details.entity.Product;

public interface ProductService {

    ProductDto createProduct(ProductDto productdto);
    Product getProduct(Long id);
}
