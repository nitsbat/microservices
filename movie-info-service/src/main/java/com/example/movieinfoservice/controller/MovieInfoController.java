package com.example.movieinfoservice.controller;

import com.example.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
    @RequestMapping("/{movieId}")
    public Movie getMovieName(@PathVariable("movieId") String movieId) {
        return new Movie(movieId, "Titanic");
    }
}
