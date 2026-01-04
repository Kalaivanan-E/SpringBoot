package com.example.FoodOrder.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodOrderDTO {

    private Long orderId;
    private String customerName;
    private String foodItem;
    private int quantity;
    private double price;
}
