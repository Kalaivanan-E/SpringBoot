package com.example.Department.Details.repository;

import com.example.Department.Details.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository <Department,Long>{
}
