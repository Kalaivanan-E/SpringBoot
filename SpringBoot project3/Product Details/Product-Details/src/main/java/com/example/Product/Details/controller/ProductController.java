package com.example.Product.Details.controller;

import com.example.Product.Details.dto.ProductDto;
import com.example.Product.Details.entity.Product;
import com.example.Product.Details.service.ProductService;
import com.example.Product.Details.service.impl.ProductServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")

public class ProductController {

    @Autowired
    private ProductServiceimpl productservice;

    @PostMapping("/saveProduct")

    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto){

        ProductDto P = productservice.createProduct(productDto);
        return new ResponseEntity<>(P, HttpStatus.CREATED);
    }
    @GetMapping ("/{id}")

    public ResponseEntity<Product> findProduct(@PathVariable Long id){

        Product p = productservice.getProduct(id);
        return  new ResponseEntity<>(p,HttpStatus.OK);
    }

    @PutMapping("/{id}")

    public ResponseEntity<ProductDto> updateProduct(@PathVariable Long id, @RequestBody ProductDto productDto){
        ProductDto P = productservice.updateProduct(id,productDto);
        return ResponseEntity.ok(P);
    }

    @DeleteMapping("/{id}")

    public ResponseEntity<String> deleteProduct(@PathVariable Long id){
        productservice.deleteProduct(id);
        return ResponseEntity.ok("Product is deleted successfullly");
    }


}
