package com.example.CourierTracking.controller;

import com.example.CourierTracking.dto.CourierDTO;
import com.example.CourierTracking.entity.CourierEntity;
import com.example.CourierTracking.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courier")
public class CourierController {
    @Autowired
    private CourierService service;

    @PostMapping("/savecourier")

    public ResponseEntity<CourierDTO> createCourier(@RequestBody CourierDTO courierdto){
        CourierDTO createcourier = service.createCourier(courierdto);
        return new ResponseEntity<>(createcourier, HttpStatus.CREATED);
    }

    @GetMapping("/{courierId}")

    public ResponseEntity<CourierEntity> getCourier(@PathVariable Long courierId){
        CourierEntity getcourier = service.getCourier(courierId);
        return new ResponseEntity<>(getcourier,HttpStatus.OK);
    }

    @PutMapping("/{courierId}")

    public ResponseEntity<CourierDTO> updateCourier(@PathVariable Long courierId, @RequestBody CourierDTO courierdto){
        CourierDTO updatecourier = service.updateCourier(courierId,courierdto);
        return ResponseEntity.ok(updatecourier);
    }
}
