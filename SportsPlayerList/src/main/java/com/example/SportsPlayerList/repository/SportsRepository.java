package com.example.SportsPlayerList.repository;

import com.example.SportsPlayerList.entity.SportsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportsRepository extends JpaRepository<SportsEntity,Long> {

    SportsEntity findByplayerId(Long playerId);
}
