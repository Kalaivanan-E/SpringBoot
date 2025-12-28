package com.example.Employee_Details.service;


import com.example.Employee_Details.dto.EmployeeDto;
import com.example.Employee_Details.entity.Employee;

public interface EmployeeService {
    EmployeeDto createEmployee (EmployeeDto employeeDto);
    Employee getEmployee(Long id);
}
