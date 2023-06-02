package wanqing18.zhang.movies;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController{
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String>payload){// convert what we receive to a map of the key string and value string and name the map as payload
        return new ResponseEntity<Review>(reviewService.createReviewBy(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }


}