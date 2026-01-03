package com.example.music.playlist.controller;

import com.example.music.playlist.dto.MusicDTO;
import com.example.music.playlist.entity.MusicEntity;
import com.example.music.playlist.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/music")
public class MusicController {

    @Autowired
    private MusicService service;

    @PostMapping("/savemusic")

    public ResponseEntity<MusicDTO> createMusic(@RequestBody MusicDTO musicdto){
        MusicDTO createmusic = service.createMusic(musicdto);
        return new ResponseEntity<>(createmusic, HttpStatus.CREATED);
    }

    @GetMapping("/{musicId}")

    public ResponseEntity<MusicEntity> getMusic(@PathVariable Long musicId){
       MusicEntity getmusic =  service.getMusic(musicId);
       return new ResponseEntity<>(getmusic,HttpStatus.OK);
    }

    @PutMapping("/{musicId}")

    public ResponseEntity<MusicDTO> updateMusic(@PathVariable Long musicId,@RequestBody MusicDTO musicdto){
        MusicDTO updatemusic = service.updateMusic(musicId,musicdto);
        return ResponseEntity.ok(updatemusic);
    }

    @DeleteMapping("/{musicId}")

    public ResponseEntity<String> deleteMusic(@PathVariable Long musicId){
        service.deleteMusic(musicId);
        return ResponseEntity.ok("Music is deleted successfully");
    }



}
