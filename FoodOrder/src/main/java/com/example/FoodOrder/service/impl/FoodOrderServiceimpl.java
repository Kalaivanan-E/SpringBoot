package com.example.FoodOrder.service.impl;

import com.example.FoodOrder.dto.FoodOrderDTO;
import com.example.FoodOrder.entity.FoodOrderEntity;
import com.example.FoodOrder.repository.FoodOrderRepository;
import com.example.FoodOrder.service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodOrderServiceimpl implements FoodOrderService {

    @Autowired
    private FoodOrderRepository repo;

    public FoodOrderDTO createFood(FoodOrderDTO foodorderdto){
        FoodOrderEntity f1 = new FoodOrderEntity(
                foodorderdto.getOrderId(),
                foodorderdto.getCustomerName(),
                foodorderdto.getFoodItem(),
                foodorderdto.getQuantity(),
                foodorderdto.getPrice()
        );
        FoodOrderEntity updatedf1 = repo.save(f1);

        FoodOrderDTO updatef1 = new FoodOrderDTO(
                updatedf1.getOrderId(),
                updatedf1.getCustomerName(),
                updatedf1.getFoodItem(),
                updatedf1.getQuantity(),
                updatedf1.getPrice()
        );
        return updatef1;
    }

    public FoodOrderEntity getFood(Long orderId){
        return repo.findByorderId(orderId);
    }

    public FoodOrderDTO updateFood(Long orderId,FoodOrderDTO foodorderdto){
        FoodOrderEntity f2 = repo.findByorderId(orderId);

        f2.setCustomerName(foodorderdto.getCustomerName());
        f2.setFoodItem(foodorderdto.getFoodItem());
        f2.setQuantity(foodorderdto.getQuantity());
        f2.setPrice(f2.getPrice());

        FoodOrderEntity savedf2 = repo.save(f2);

        FoodOrderDTO savef2 = new FoodOrderDTO(
                savedf2.getOrderId(),
                savedf2.getCustomerName(),
                savedf2.getFoodItem(),
                savedf2.getQuantity(),
                savedf2.getPrice()
        );
        return savef2;
    }
    public void deleteFood(Long orderId){
        FoodOrderEntity f2=repo.findByorderId(orderId);
        repo.delete(f2);
    }
}
