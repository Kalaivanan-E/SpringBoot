package com.example.Product.Details.service.impl;

import com.example.Product.Details.dto.ProductDto;
import com.example.Product.Details.entity.Product;
import com.example.Product.Details.repository.ProductRespository;
import com.example.Product.Details.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductServiceimpl implements ProductService {
    @Autowired
    private ProductRespository respository;
    @Override
    public ProductDto createProduct(ProductDto productdto) {

        Product P = new Product(
                productdto.getId(),
                productdto.getProductName(),
                productdto.getPrice(),
                productdto.getQuantity()
        );
        Product savedProduct = respository.save(P);
        ProductDto saveproduct = new ProductDto(
                savedProduct.getId(),
                savedProduct.getProductName(),
                savedProduct.getPrice(),
                savedProduct.getQuantity()
        );
        return saveproduct;
    }
    public Product getProduct(Long id){
        return respository.findByid(id);
    }
    public ProductDto updateProduct(Long id, ProductDto productDto){
        Product updateproduct = respository.findByid(id);

        updateproduct.setProductName(productDto.getProductName());
        updateproduct.setPrice(productDto.getPrice());
        updateproduct.setQuantity(productDto.getQuantity());

        Product UpdatedProduct = respository.save(updateproduct);

        return new ProductDto(
                updateproduct.getId(),
                updateproduct.getProductName(),
                updateproduct.getPrice(),
                updateproduct.getQuantity()
        );
    }
    public void deleteProduct(Long id){
        Product product = respository.findByid(id);
        respository.delete(product);
    }

}
