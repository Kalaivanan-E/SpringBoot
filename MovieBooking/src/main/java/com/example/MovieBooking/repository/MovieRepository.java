package com.example.MovieBooking.repository;

import com.example.MovieBooking.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Long> {


}
