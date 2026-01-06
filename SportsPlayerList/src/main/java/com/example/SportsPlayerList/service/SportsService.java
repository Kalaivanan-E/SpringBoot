package com.example.SportsPlayerList.service;

import com.example.SportsPlayerList.dto.SportsDTO;
import com.example.SportsPlayerList.entity.SportsEntity;

public interface SportsService {

    SportsDTO createPlayer(SportsDTO sportsdto);
    SportsEntity getPlayer(Long playerId);
    SportsDTO updatePlayer(Long playerId, SportsDTO sportsdto);
    void deletePlayer(Long playerId);
}
