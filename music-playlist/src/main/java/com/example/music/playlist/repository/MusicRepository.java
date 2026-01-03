package com.example.music.playlist.repository;

import com.example.music.playlist.entity.MusicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<MusicEntity,Long> {

    MusicEntity findBymusicId(Long musicId);
}
