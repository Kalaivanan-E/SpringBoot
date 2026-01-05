package com.example.CourierTracking.repository;

import com.example.CourierTracking.entity.CourierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourierRepository extends JpaRepository<CourierEntity, Long> {

    CourierEntity findBycourierId(Long courierId);
}
