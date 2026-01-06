package com.example.ElectricityBill.repository;

import com.example.ElectricityBill.entity.ElectricityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectricityRepository extends JpaRepository<ElectricityEntity,Long> {

    ElectricityEntity findBybillId(Long billId);
}
