package com.example.FoodOrder.controller;


import com.example.FoodOrder.dto.FoodOrderDTO;
import com.example.FoodOrder.entity.FoodOrderEntity;
import com.example.FoodOrder.service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/food")
public class FoodOrderController {

    @Autowired
    private FoodOrderService service;

    @PostMapping("/savefood")

    public ResponseEntity<FoodOrderDTO> createFood(@RequestBody FoodOrderDTO foodorderdto){
        FoodOrderDTO createfood = service.createFood(foodorderdto);
        return new ResponseEntity<>(createfood, HttpStatus.CREATED);
    }

    @GetMapping("/{orderId}")

    public ResponseEntity<FoodOrderEntity> getFood(@PathVariable Long orderId){
        FoodOrderEntity getfood = service.getFood(orderId);
        return new ResponseEntity<>(getfood,HttpStatus.OK);
    }

    @PutMapping("/{orderId}")

    public ResponseEntity<FoodOrderDTO> updateFood(@PathVariable Long orderId, @RequestBody FoodOrderDTO foodorderdto){
        FoodOrderDTO updatefood = service.updateFood(orderId,foodorderdto);
        return ResponseEntity.ok(updatefood);
    }

    @DeleteMapping("/{orderId}")

    public ResponseEntity<String> deleteFood(@PathVariable Long orderId){
        service.deleteFood(orderId);
        return ResponseEntity.ok("Food is deleted successfully");
    }
}
