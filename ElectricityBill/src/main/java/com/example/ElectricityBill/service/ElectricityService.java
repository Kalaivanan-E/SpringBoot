package com.example.ElectricityBill.service;

import com.example.ElectricityBill.dto.ElectricityDTO;
import com.example.ElectricityBill.entity.ElectricityEntity;

public interface ElectricityService {

    ElectricityDTO createbill(ElectricityDTO electricitydto);
    ElectricityEntity getbill(Long billId);
    ElectricityDTO updatebill(Long billId, ElectricityDTO electricitydto);
    void deletebill(Long billId);


}
