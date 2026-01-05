package com.example.CourierTracking.service.impl;

import com.example.CourierTracking.dto.CourierDTO;
import com.example.CourierTracking.entity.CourierEntity;
import com.example.CourierTracking.repository.CourierRepository;
import com.example.CourierTracking.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourierServiceimpl implements CourierService {

    @Autowired
    private CourierRepository repo;

    public CourierDTO createCourier(CourierDTO courierdto){
        CourierEntity createcourier = new CourierEntity(
                courierdto.getCourierId(),
                courierdto.getTrackingId(),
                courierdto.getSenderName(),
                courierdto.getReceiverName()
        );
        CourierEntity savedcourier = repo.save(createcourier);

        CourierDTO savecourier = new CourierDTO(
                savedcourier.getCourierId(),
                savedcourier.getTrackingId(),
                savedcourier.getSenderName(),
                savedcourier.getReceiverName()
        );
        return savecourier;
    }
    public CourierEntity getCourier(Long courierId){
        return repo.findBycourierId(courierId);
    }
}
