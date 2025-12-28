package com.example.Department.Details.service;

import com.example.Department.Details.dto.DepartmentDTO;
import com.example.Department.Details.entity.Department;

public interface DepartmentService {
    DepartmentDTO createEmployee(DepartmentDTO departmentDTO);
    Department getEmployee(Long id);
}
