package com.example.CourierTracking.service;

import com.example.CourierTracking.dto.CourierDTO;
import com.example.CourierTracking.entity.CourierEntity;

public interface CourierService {

    CourierDTO createCourier(CourierDTO courierdto);
    CourierEntity getCourier(Long courierId);
    CourierDTO updateCourier(Long courierId, CourierDTO courierdto);
}
