package com.project.moviereview.controller;

import com.project.moviereview.model.Movie;
import com.project.moviereview.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping
    public List<Movie> findAll() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Optional<Movie> findById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

}
