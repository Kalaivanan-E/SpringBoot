package com.example.BankAccountManagement.controller;

import com.example.BankAccountManagement.dto.BankDTO;
import com.example.BankAccountManagement.entity.BankEntity;
import com.example.BankAccountManagement.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/bank")
public class BankController {

    @Autowired
    private BankService service;

    @PostMapping("/savebank")

    public ResponseEntity<BankDTO> createAccount(@RequestBody BankDTO bankdto){
        BankDTO BAM = service.createAccount(bankdto);
        return new ResponseEntity<>(BAM, HttpStatus.CREATED);
    }

    @GetMapping("/{accountId}")

    public ResponseEntity<BankEntity> getAccount(@PathVariable Long accountId){
        BankEntity bam = service.getAccount(accountId);
        return new ResponseEntity<>(bam,HttpStatus.OK);
    }

    @PutMapping("/{accountId}")

    public ResponseEntity<BankDTO> updateAccount(@PathVariable Long accountId, @RequestBody BankDTO bankdto){
        BankDTO bam2 = service.updateAccount(accountId, bankdto);
        return ResponseEntity.ok(bam2);
    }

    @DeleteMapping("/{accountId}")

    public ResponseEntity<String> deleteAccount(@PathVariable Long accountId){
        service.deleteAccount(accountId);
        return ResponseEntity.ok("Account is deleted successfully");
    }


}
