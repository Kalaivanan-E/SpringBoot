package com.example.BusBooking.service.impl;

import com.example.BusBooking.dto.BusDTO;
import com.example.BusBooking.entity.BusEntity;
import com.example.BusBooking.repository.BusRepository;
import com.example.BusBooking.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceimpl implements BusService {
    @Autowired
    private BusRepository repo;

    public BusDTO createBus(BusDTO busdto){
        BusEntity p1 = new BusEntity(
                busdto.getBusId(),
                busdto.getName(),
                busdto.getAge(),
                busdto.getGender(),
                busdto.getPhoneNo()
        );
        BusEntity savedp1 = repo.save(p1);
        BusDTO savep1 = new BusDTO(
                savedp1.getBusId(),
                savedp1.getName(),
                savedp1.getAge(),
                savedp1.getGender(),
                savedp1.getPhoneNo()
        );
        return savep1;
    }
    public BusEntity getBus(Long busId){
        return repo.findBybusId(busId);
    }

    public BusDTO updateBus(Long busId, BusDTO busdto){
        BusEntity B2 = repo.findBybusId(busId);

        B2.setAge(busdto.getAge());
        B2.setName(busdto.getName());
        B2.setGender(busdto.getGender());
        B2.setPhoneNo(busdto.getPhoneNo());

        BusEntity updatedbus = repo.save(B2);

        return new BusDTO(
                updatedbus.getBusId(),
                updatedbus.getName(),
                updatedbus.getAge(),
                updatedbus.getGender(),
                updatedbus.getPhoneNo()
        );
    }
    public void deleteBus(Long busId){
        BusEntity bus =repo.findBybusId(busId);
        repo.delete(bus);
    }

}
