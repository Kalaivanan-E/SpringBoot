package com.example.Employee_Details.service.impl;

import com.example.Employee_Details.dto.EmployeeDto;
import com.example.Employee_Details.entity.Employee;
import com.example.Employee_Details.repository.EmployeeRepository;
import com.example.Employee_Details.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // that contains business logic
public class EmployeeServiceimpl implements EmployeeService {

    @Autowired  // inject one class object into another class
    private EmployeeRepository repo;

    public EmployeeDto createEmployee (EmployeeDto employeeDto){
        Employee Emp = new Employee(
                employeeDto.getId(),
                employeeDto.getEmployee_Name(),
                employeeDto.getSalary()
        );
        Employee savedEmployee = repo.save(Emp);
        EmployeeDto saveEmployee = new EmployeeDto(
                savedEmployee.getId(),
                savedEmployee.getEmployee_Name(),
                savedEmployee.getSalary()
        );
        return saveEmployee;
    }
    public Employee getEmployee(Long id){
            return repo.findById(id)
                    .orElseThrow(()->new RuntimeException("Employee not found"));

    }

 }
