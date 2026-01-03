package com.example.music.playlist.service.impl;

import com.example.music.playlist.dto.MusicDTO;
import com.example.music.playlist.entity.MusicEntity;
import com.example.music.playlist.repository.MusicRepository;
import com.example.music.playlist.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicServiceimpl implements MusicService {

    @Autowired
    private MusicRepository repo;

    public MusicDTO createMusic(MusicDTO musicdto){
        MusicEntity music = new MusicEntity(
                musicdto.getMusicId(),
                musicdto.getName(),
                musicdto.getArtist(),
                musicdto.getYear()
        );
        MusicEntity updatedmusic = repo.save(music);

        MusicDTO updatemusic = new MusicDTO(
                updatedmusic.getMusicId(),
                updatedmusic.getName(),
                updatedmusic.getArtist(),
                updatedmusic.getYear()
        );
        return updatemusic;

    }
    public MusicEntity getMusic(Long musicId){
        return repo.findBymusicId(musicId);
    }

    public MusicDTO updateMusic(Long musicId, MusicDTO musicdto){
        MusicEntity m3 = repo.findBymusicId(musicId);

        m3.setName(musicdto.getName());
        m3.setArtist(musicdto.getArtist());
        m3.setYear(musicdto.getYear());

        MusicEntity savem3 = repo.save(m3);

        MusicDTO savemusic = new MusicDTO(
                savem3.getMusicId(),
                savem3.getName(),
                savem3.getArtist(),
                savem3.getYear()
        );
        return savemusic;
    }
    public void deleteMusic(Long musicId){
            MusicEntity deleted = repo.findBymusicId(musicId);
            repo.delete(deleted);
    }
}
