package com.example.movieratingservice.resources;

import com.example.movieratingservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }

    @RequestMapping("users/{userId}")
    public List<Rating> getUserRating(@PathVariable("userId") String userId){
                //hardcode response from rating data api for now
                List<Rating> ratings = Arrays.asList(
                        new Rating("1234", 4),
                        new Rating("5575", 5)
        );
                return ratings;
    }
}
