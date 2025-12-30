package com.example.Employee_Details.controller;

import com.example.Employee_Details.dto.EmployeeDto;
import com.example.Employee_Details.entity.Employee;
import com.example.Employee_Details.service.EmployeeService;
import com.example.Employee_Details.service.impl.EmployeeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // it handles controller class, it returns data as json or xml format
@RequestMapping ("/api/employee")  // base url
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/saveEmployee") // to create data

    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto emp =service.createEmployee(employeeDto);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")

    public  ResponseEntity<Employee> getEmployee(@PathVariable Long id){
        Employee emp = service.getEmployee(id);
        return new ResponseEntity<>(emp,HttpStatus.OK);
    }

    @PutMapping("/{id}")

    public ResponseEntity<EmployeeDto> upateEmployee(
            @PathVariable Long id,
            @RequestBody EmployeeDto employeeDto
    ){
        EmployeeDto updatedEmployee = service.updateEmployee(id, employeeDto);
        return ResponseEntity.ok(updatedEmployee);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        service.deleteEmployee(id);
        return ResponseEntity.ok("Employee is deleted successfully");
    }

}
