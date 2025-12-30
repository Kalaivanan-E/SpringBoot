package com.example.CarRental.controller;

import com.example.CarRental.dto.CarRentalDto;
import com.example.CarRental.entity.CarRental;
import com.example.CarRental.service.impl.CarRentalServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/carrental")
public class CarRentalController {

    @Autowired
    private CarRentalServiceimpl service;

    @PostMapping("/savecar")

    public ResponseEntity<CarRentalDto> createCar(@RequestBody  CarRentalDto carRentaldto){
        CarRentalDto car = service.createCar(carRentaldto);
        return new  ResponseEntity<>(car,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")

    public ResponseEntity<CarRental> getCar(@PathVariable Long id){
        CarRental car = service.getCar(id);
        return new ResponseEntity<>(car,HttpStatus.OK);
    }

    @PutMapping("/{id}")

    public ResponseEntity<CarRentalDto> updateCar(
            @PathVariable Long id,
            @RequestBody CarRentalDto carRentaldto){
        CarRentalDto updatedCar = service.updateCar(id,carRentaldto);
        return ResponseEntity.ok(updatedCar);

    }

    @DeleteMapping("/{id}")

    public ResponseEntity<String> deleteCar(@PathVariable Long id){
            service.deleteCar(id);
            return ResponseEntity.ok("Car is deleted successfully");
    }
}
