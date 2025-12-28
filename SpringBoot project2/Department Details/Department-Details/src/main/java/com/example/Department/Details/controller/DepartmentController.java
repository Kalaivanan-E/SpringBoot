package com.example.Department.Details.controller;

import com.example.Department.Details.dto.DepartmentDTO;
import com.example.Department.Details.entity.Department;
import com.example.Department.Details.service.impl.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    private DepartmentServiceImpl service;

    @PostMapping("/saveDept")

    public ResponseEntity<DepartmentDTO> createEmployee(@RequestBody DepartmentDTO departmentDTO) {
        DepartmentDTO D = service.createEmployee(departmentDTO);
        return new ResponseEntity<>(D, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> findEmployee(@PathVariable Long id){
        Department D = service.getEmployee(id);
        return new ResponseEntity<>(D,HttpStatus.OK);
    }

}
