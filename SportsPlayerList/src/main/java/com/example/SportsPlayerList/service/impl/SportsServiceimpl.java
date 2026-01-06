package com.example.SportsPlayerList.service.impl;

import com.example.SportsPlayerList.dto.SportsDTO;
import com.example.SportsPlayerList.entity.SportsEntity;
import com.example.SportsPlayerList.repository.SportsRepository;
import com.example.SportsPlayerList.service.SportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportsServiceimpl implements SportsService {

    @Autowired
    private SportsRepository repo;

    public SportsDTO createPlayer(SportsDTO sportsdto){
        SportsEntity p1 = new SportsEntity(
                sportsdto.getPlayerId(),
                sportsdto.getPlayerName(),
                sportsdto.getAge(),
                sportsdto.getGender()
        );
        SportsEntity savedp1 = repo.save(p1);
        return new SportsDTO(
                savedp1.getPlayerId(),
                savedp1.getPlayerName(),
                savedp1.getAge(),
                savedp1.getGender()
        );
    }
    public SportsEntity getPlayer(Long playerId){
        return repo.findByplayerId(playerId);
    }
    public SportsDTO updatePlayer(Long playerId,SportsDTO sportsdto){
        SportsEntity p1 = repo.findByplayerId(playerId);
        p1.setPlayerName(sportsdto.getPlayerName());
        p1.setAge(sportsdto.getAge());
        p1.setGender(sportsdto.getGender());

        SportsEntity savedp1 = repo.save(p1);

        return new SportsDTO(
                savedp1.getPlayerId(),
                savedp1.getPlayerName(),
                savedp1.getAge(),
                savedp1.getGender()
        );
    }

    public void deletePlayer(Long playerId){
        SportsEntity p1 = repo.findByplayerId(playerId);
        repo.delete(p1);
    }
}
