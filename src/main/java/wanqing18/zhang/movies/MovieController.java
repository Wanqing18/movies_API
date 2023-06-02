package wanqing18.zhang.movies;

import java.util.List;
import java.util.Optional;

//import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // one of the API layer is controller, adding request and return response
@RequestMapping("/api/v1/movies")
public class MovieController {// here is using server class, taking allmoview from data base and give it to the http url
    @Autowired
    private MovieService MovieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(MovieService.allMovies(),HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")// search by id in url, api-db/id-> give film info
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movie>>(MovieService.singleMovie(imdbId), HttpStatus.OK);

    }   
}
