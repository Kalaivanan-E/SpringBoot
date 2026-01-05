package com.example.MovieBooking.service.impl;

import com.example.MovieBooking.dto.MovieDTO;
import com.example.MovieBooking.entity.MovieEntity;
import com.example.MovieBooking.repository.MovieRepository;
import com.example.MovieBooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceimpl implements MovieService {

    @Autowired
    private MovieRepository repo;

    public MovieDTO createMovie (MovieDTO moviedto){
        MovieEntity m1 = new MovieEntity(
                moviedto.getId(),
                moviedto.getMovieName(),
                moviedto.getTheatreName(),
                moviedto.getSeatcount(),
                moviedto.getPrice()
        );
        MovieEntity savedm1 = repo.save(m1);

        MovieDTO savem1 = new MovieDTO(
                savedm1.getId(),
                savedm1.getMovieName(),
                savedm1.getTheatreName(),
                savedm1.getSeatcount(),
                savedm1.getPrice()
        );
        return savem1;
    }
}
