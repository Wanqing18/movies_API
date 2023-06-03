//package wanqing18.zhang.movies;
//
//import org.bson.types.ObjectId;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.DocumentReference;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.List;
//
//@Document(collection = "movies")
//@Data // @ in java:it adds a special attribute to the variable, method, class, interface, or other language elements.
////When you add an annotation to something, other parts of the program can check whether something has an annotation or not
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class Movie {
//
//    @Id
//
//    private ObjectId id;//unique identifier for each movie
//
//    private String imdbId;
//
//    private String title;
//
//    private String releaseDate;
//
//    private String trailerLink;
//
//    private String poster;
//
//    private List<String> genres;
//
//    private List<String> backdrops;
//
//    @DocumentReference// only id of reviews, reviews itself will be in different collections
//    private List<Review> reviewIds;
//
//
//}
