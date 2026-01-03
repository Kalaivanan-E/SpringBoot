package com.example.music.playlist.service;

import com.example.music.playlist.dto.MusicDTO;
import com.example.music.playlist.entity.MusicEntity;

public interface MusicService {

    MusicDTO createMusic(MusicDTO musicdto);
    MusicEntity getMusic(Long musicId);
    MusicDTO updateMusic(Long musicId, MusicDTO musicdto);
    void deleteMusic(Long musicId);
}
