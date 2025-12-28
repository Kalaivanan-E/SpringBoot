package com.example.Employee_Details.controller;

import com.example.Employee_Details.dto.EmployeeDto;
import com.example.Employee_Details.service.impl.EmployeeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // it handles controller class, it returns data as json or xml format
@RequestMapping ("/api/employee")  // base url
public class EmployeeController {

    @Autowired
    private EmployeeServiceimpl service;

    @PostMapping("/saveEmployee") // to create data

    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto emp =service.createEmployee(employeeDto);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }

}
