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
                moviedto.getSeatCount(),
                moviedto.getTheatreName(),
                moviedto.getPrice()
        );
        MovieEntity savedm1 = repo.save(m1);

        MovieDTO savem1 = new MovieDTO(
                savedm1.getId(),
                savedm1.getMovieName(),
                savedm1.getSeatCount(),
                savedm1.getTheatreName(),
                savedm1.getPrice()
        );
        return savem1;
    }
    public MovieEntity getMovie(Long id){
        return repo.findByid(id);
    }

    public MovieDTO updateMovie(Long id, MovieDTO moviedto){
        MovieEntity m2 = repo.findByid(id);
        m2.setMovieName(moviedto.getMovieName());
        m2.setSeatCount(moviedto.getSeatCount());
        m2.setTheatreName(moviedto.getTheatreName());
        m2.setPrice(moviedto.getPrice());

        MovieEntity savedm2 = repo.save(m2);

        return new MovieDTO(
                savedm2.getId(),
                savedm2.getMovieName(),
                savedm2.getSeatCount(),
                savedm2.getTheatreName(),
                savedm2.getPrice()
        );
    }
    public void deleteMovie(Long id){
        MovieEntity m4 = repo.findByid(id);
        repo.delete(m4);
    }

}
