package com.example.ratingsdataservice.controller;

import com.example.ratingsdataservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsController {
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(4, movieId);
    }

    @RequestMapping("users/{userId}")
    public List<Rating> getRatings(@PathVariable("userId") String userId) {
        return List.of(
                new Rating(4, "123"),
                new Rating(5, "134")
        );
    }
}
