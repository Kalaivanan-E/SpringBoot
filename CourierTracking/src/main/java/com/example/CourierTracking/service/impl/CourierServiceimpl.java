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
    public CourierDTO updateCourier(Long courierId, CourierDTO courierdto){
        CourierEntity m2 = repo.findBycourierId(courierId);

        m2.setTrackingId(courierdto.getTrackingId());
        m2.setSenderName(courierdto.getSenderName());
        m2.setReceiverName(courierdto.getReceiverName());

        CourierEntity savedm2 = repo.save(m2);

        CourierDTO savem2 = new CourierDTO(
                savedm2.getCourierId(),
                savedm2.getTrackingId(),
                savedm2.getSenderName(),
                savedm2.getReceiverName()
        );
        return savem2;
    }
    public void deleteCourier(Long courierId){
        CourierEntity deletecourier = repo.findBycourierId(courierId);
        repo.delete(deletecourier);
    }

}
