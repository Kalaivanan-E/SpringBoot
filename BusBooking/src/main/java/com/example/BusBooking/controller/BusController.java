package com.example.BusBooking.controller;

import com.example.BusBooking.dto.BusDTO;
import com.example.BusBooking.entity.BusEntity;
import com.example.BusBooking.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bus")
public class BusController {

    @Autowired
    private BusService service;

    @PostMapping("/savebus")

    public ResponseEntity<BusDTO> createBus(@RequestBody BusDTO busdto){
        BusDTO savebus = service.createBus(busdto);
        return new ResponseEntity<>(savebus, HttpStatus.CREATED);
    }

    @GetMapping("/{busId}")

    public ResponseEntity<BusEntity> getBus(@PathVariable Long busId){
        BusEntity getbus = service.getBus(busId);
        return new ResponseEntity<>(getbus,HttpStatus.OK);
    }

    @PutMapping("/{busId}")

    public ResponseEntity<BusDTO> updateBus(@PathVariable Long busId, @RequestBody BusDTO busdto){
        BusDTO updatebus = service.updateBus(busId,busdto);
        return new ResponseEntity<>(updatebus,HttpStatus.CREATED);
    }

    @DeleteMapping("/{busId}")

    public ResponseEntity<String> deleteBus(@PathVariable Long busId){
        service.deleteBus(busId);
        return ResponseEntity.ok("Bus is deleted successfully");
    }
}
