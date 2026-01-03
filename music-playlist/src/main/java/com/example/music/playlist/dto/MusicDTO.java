package com.example.music.playlist.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MusicDTO {

    private Long musicId;
    private String name;
    private String artist;
    private int year;
}
