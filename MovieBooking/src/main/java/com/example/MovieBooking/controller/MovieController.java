package com.example.MovieBooking.controller;

import com.example.MovieBooking.dto.MovieDTO;
import com.example.MovieBooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping("/savemovie")
    public ResponseEntity<MovieDTO> createMovie(@RequestBody MovieDTO moviedto){
        MovieDTO createmovie = service.createMovie(moviedto);
        return new ResponseEntity<>(createmovie, HttpStatus.CREATED);
    }
}
