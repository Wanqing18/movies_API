//package wanqing18.zhang.movies;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
////import org.springframework.data.mongodb.core.ExecutableUpdateOperation.UpdateWithUpdate;
//import org.springframework.data.mongodb.core.query.Criteria;
////import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.data.mongodb.core.query.Update;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ReviewService {
//
//    @Autowired
//    private ReviewRepository reviewRepository;//reference to reviewrepository 储存库repository: one of the way that connect to database
//
//    @Autowired
//    private MongoTemplate mongoTemplate;// also a way to talk to database, complicated operations could not be taken by repository, but template could do it
//
//    public Review createReviewBy(String reviewBody, String imdbId){
//
//// 2 parameters are taken, look for the movie by imdbid, and associate the review with the found movie
//        Review review = reviewRepository.insert(new Review(reviewBody));// save the review on itself, since data keep updating
//
//
//        mongoTemplate.update(Movie.class)
//                .matching(Criteria.where("imdbId").is(imdbId))//update a movie review where the imdbid of the movie in database match the imdb id we receive by users
//                .apply(new Update().push("reviewIds").value(review))//add the content of review to the database, currently no review data in database
//                .first();
//
//        return review;
//            }
//
//
//
//}
