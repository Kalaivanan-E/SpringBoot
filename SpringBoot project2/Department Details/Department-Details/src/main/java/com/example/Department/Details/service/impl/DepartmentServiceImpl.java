package com.example.Department.Details.service.impl;

import com.example.Department.Details.dto.DepartmentDTO;
import com.example.Department.Details.entity.Department;
import com.example.Department.Details.repository.DepartmentRepository;
import com.example.Department.Details.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository repository;
    @Override
    public DepartmentDTO createEmployee(DepartmentDTO departmentDTO) {
        Department D = new Department(
        departmentDTO.getId(),
        departmentDTO.getName(),
        departmentDTO.getSalary()
        );
        Department savedDepartment = repository.save(D);
        DepartmentDTO saveDepartment = new DepartmentDTO(
       savedDepartment.getId(),
       savedDepartment.getName(),
       savedDepartment.getSalary()
        );

      return saveDepartment;
    }
    public Department getEmployee(Long id){
        return repository.findById(id)
                .orElseThrow(()->new RuntimeException("employee not found "));
    }


}
