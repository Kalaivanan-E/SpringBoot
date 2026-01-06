package com.example.MovieBooking.controller;

import com.example.MovieBooking.dto.MovieDTO;
import com.example.MovieBooking.entity.MovieEntity;
import com.example.MovieBooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<MovieEntity> getMovie(@PathVariable Long id){
        MovieEntity getmovie = service.getMovie(id);
        return new ResponseEntity<>(getmovie,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovieDTO> updateMovie(@PathVariable Long id,@RequestBody MovieDTO moviedto){
        MovieDTO update = service.updateMovie(id,moviedto);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/{id}")

    public ResponseEntity<String> deleteMovie(@PathVariable Long id){
        service.deleteMovie(id);
        return ResponseEntity.ok("Ticket deleted ");
    }

}
