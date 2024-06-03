package dev.ansari.movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private  ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    public Review createReview(String reviewBody, String imdbID){

        Review review = new Review(reviewBody);
        reviewRepository.insert(review);

        mongoTemplate.update(movie.class)
                .matching(Criteria.where("imdbID").is(imdbID))
                .apply(new Update().push("reviewID").value(review))
                .first();

        return  review;


    }
}
