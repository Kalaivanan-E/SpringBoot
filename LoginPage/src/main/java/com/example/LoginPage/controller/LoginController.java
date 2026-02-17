package com.example.LoginPage.controller;

import com.example.LoginPage.dto.LoginDTO;
import com.example.LoginPage.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private LoginService service;
    @PostMapping("/save")
    public ResponseEntity<LoginDTO> create (@RequestBody LoginDTO logindto){
        LoginDTO create = service.create(logindto);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }
}
