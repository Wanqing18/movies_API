//package wanqing18.zhang.movies;
//
//import java.util.List;
//import java.util.Optional;
//
////import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MovieService {
//    @Autowired
//
//    private MovieRepository MovieRepository;// refernce for repository
//
//    public List<Movie> allMovies(){// use repository class, connect to database, get list of movie and return the data
//        return MovieRepository.findAll();
//
//    }
//
//    public Optional<Movie> singleMovie(String imdbId) {//adding option let java know, the searching movie may not in teh database, there is null exist
//        return MovieRepository.findMovieByImdbId(imdbId);
//    }
//
//}
