package com.example.CartItem.service.impl;

import com.example.CartItem.dto.CartItemDTO;
import com.example.CartItem.entity.CartItemEntity;
import com.example.CartItem.repository.CartItemRepository;
import com.example.CartItem.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemServiceimpl implements CartItemService {

    @Autowired
    private CartItemRepository repo;

    public CartItemDTO createProduct(CartItemDTO cartitemdto){
        CartItemEntity m1 = new CartItemEntity(
                cartitemdto.getCartId(),
                cartitemdto.getProductName(),
                cartitemdto.getQuantity(),
                cartitemdto.getPrice()
        );
        CartItemEntity savedm1 = repo.save(m1);

        CartItemDTO savem1 = new CartItemDTO(
                savedm1.getCartId(),
                savedm1.getProductName(),
                savedm1.getQuantity(),
                savedm1.getPrice()
        );
        return savem1;
    }
}
