package com.example.MovieBooking.service;

import com.example.MovieBooking.dto.MovieDTO;
import com.example.MovieBooking.entity.MovieEntity;

public interface MovieService {

    MovieDTO createMovie(MovieDTO moviedto);
    MovieEntity getMovie(Long id);
    MovieDTO updateMovie(Long id, MovieDTO moviedto);
    void deleteMovie(Long id);
}
