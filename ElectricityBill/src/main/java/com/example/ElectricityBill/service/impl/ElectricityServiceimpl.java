package com.example.ElectricityBill.service.impl;

import com.example.ElectricityBill.dto.ElectricityDTO;
import com.example.ElectricityBill.entity.ElectricityEntity;
import com.example.ElectricityBill.repository.ElectricityRepository;
import com.example.ElectricityBill.service.ElectricityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectricityServiceimpl implements ElectricityService {

    @Autowired
    private ElectricityRepository repo;

    public ElectricityDTO createbill(ElectricityDTO electricitydto){
        ElectricityEntity bill1 = new ElectricityEntity(
                electricitydto.getBillId(),
                electricitydto.getUnits(),
                electricitydto.getAmount()
        );
        ElectricityEntity savedbill1 = repo.save(bill1);

        return new ElectricityDTO(
                savedbill1.getBillId(),
                savedbill1.getUnits(),
                savedbill1.getAmount()
        );
    }
    public ElectricityEntity getbill(Long billId){
        return repo.findBybillId(billId);
    }
    public ElectricityDTO updatebill(Long billId, ElectricityDTO electricitydto){
        ElectricityEntity bill2 = repo.findBybillId(billId);

        bill2.setUnits(electricitydto.getUnits());
        bill2.setAmount(electricitydto.getAmount());

        ElectricityEntity savedbill2 = repo.save(bill2);

        return new ElectricityDTO(
                savedbill2.getBillId(),
                savedbill2.getUnits(),
                savedbill2.getAmount()
        );
    }
    public void deletebill(Long billId){
        ElectricityEntity bill3 = repo.findBybillId(billId);
        repo.delete(bill3);
    }
}
