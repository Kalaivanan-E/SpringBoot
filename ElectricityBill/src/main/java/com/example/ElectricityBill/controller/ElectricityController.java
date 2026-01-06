package com.example.ElectricityBill.controller;

import com.example.ElectricityBill.dto.ElectricityDTO;
import com.example.ElectricityBill.entity.ElectricityEntity;
import com.example.ElectricityBill.service.ElectricityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bills")
public class ElectricityController {
    @Autowired
    private ElectricityService service;

    @PostMapping("/savebill")
    public ResponseEntity<ElectricityDTO> createbill(@RequestBody ElectricityDTO electricitydto){
        ElectricityDTO create = service.createbill(electricitydto);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }
    @GetMapping("/{billId}")
    public ResponseEntity<ElectricityEntity> getbill(@PathVariable Long billId){
        ElectricityEntity get = service.getbill(billId);
        return new ResponseEntity<>(get,HttpStatus.OK);
    }
    @PutMapping("/{billId}")
    public ResponseEntity<ElectricityDTO> updatebill(@PathVariable Long billId,@RequestBody ElectricityDTO electricitydto){
        ElectricityDTO update = service.updatebill(billId,electricitydto);
        return ResponseEntity.ok(update);
    }
    @DeleteMapping("/{billId}")
    public ResponseEntity<String> deletebill(@PathVariable Long billId){
        service.deletebill(billId);
        return ResponseEntity.ok("Deleted successfully");
    }
}
