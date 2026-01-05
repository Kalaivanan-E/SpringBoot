package com.example.CartItem.controller;

import com.example.CartItem.dto.CartItemDTO;
import com.example.CartItem.repository.CartItemRepository;
import com.example.CartItem.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class CartItemController {
    @Autowired
    private CartItemService service;

    @PostMapping("/saveproduct")

    public ResponseEntity<CartItemDTO> createProduct(@RequestBody CartItemDTO cartitemdto){
        CartItemDTO create = service.createProduct(cartitemdto);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }
}
