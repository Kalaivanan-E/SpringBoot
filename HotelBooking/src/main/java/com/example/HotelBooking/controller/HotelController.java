package com.example.HotelBooking.controller;

import com.example.HotelBooking.dto.HotelDTO;
import com.example.HotelBooking.entity.HotelEntity;
import com.example.HotelBooking.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {

    @Autowired
    private HotelService service;

    @PostMapping("/savehotel")
    public ResponseEntity<HotelDTO> createhotel(@RequestBody HotelDTO hoteldto){
        HotelDTO create = service.createhotel(hoteldto);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<HotelEntity> gethotel(@PathVariable Long id){
        HotelEntity get = service.gethotel(id);
        return new ResponseEntity<>(get,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<HotelDTO>updatehotel(@PathVariable Long id, @RequestBody HotelDTO hoteldto){
        HotelDTO update = service.updatehotel(id,hoteldto);
        return ResponseEntity.ok(update);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletehotel(@PathVariable Long id){
        service.deletehotel(id);
        return ResponseEntity.ok("Deleted successfully");
    }

}
