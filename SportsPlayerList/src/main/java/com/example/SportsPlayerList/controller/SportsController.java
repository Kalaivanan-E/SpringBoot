package com.example.SportsPlayerList.controller;

import com.example.SportsPlayerList.dto.SportsDTO;
import com.example.SportsPlayerList.entity.SportsEntity;
import com.example.SportsPlayerList.service.SportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sports")
public class SportsController {
    @Autowired
    private SportsService service;

    @PostMapping("/savePlayer")

    public ResponseEntity<SportsDTO> createPlayer(@RequestBody SportsDTO sportsdto){
        SportsDTO create = service.createPlayer(sportsdto);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }
    @GetMapping("/{playerId}")
    public ResponseEntity<SportsEntity> getPlayer(@PathVariable Long playerId){
        SportsEntity get = service.getPlayer(playerId);
        return new ResponseEntity<>(get,HttpStatus.OK);
    }
    @PutMapping("/{playerId}")
    public ResponseEntity<SportsDTO> updatePlayer(@PathVariable Long playerId,@RequestBody SportsDTO sportsdto){
        SportsDTO update = service.updatePlayer(playerId,sportsdto);
        return ResponseEntity.ok(update);
    }
    @DeleteMapping("/{playerId}")
    public ResponseEntity<String> deletePlayer(@PathVariable Long playerId){
        service.deletePlayer(playerId);
        return ResponseEntity.ok("Deleted successfully");
}
}
