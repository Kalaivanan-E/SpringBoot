package com.example.FoodOrder.service;

import com.example.FoodOrder.dto.FoodOrderDTO;
import com.example.FoodOrder.entity.FoodOrderEntity;

public interface FoodOrderService {

    public FoodOrderDTO createFood(FoodOrderDTO foodorderdto);
    public FoodOrderEntity getFood(Long orderId);
    public FoodOrderDTO updateFood(Long orderId, FoodOrderDTO foodorderdto);
    void deleteFood(Long orderId);
}
