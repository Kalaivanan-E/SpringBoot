package com.example.FoodOrder.repository;


import com.example.FoodOrder.entity.FoodOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodOrderRepository extends JpaRepository<FoodOrderEntity, Long> {

    FoodOrderEntity findByorderId(Long orderId);
}
