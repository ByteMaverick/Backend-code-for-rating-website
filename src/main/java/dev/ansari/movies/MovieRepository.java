package dev.ansari.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MovieRepository extends MongoRepository<movie, ObjectId> {

    Optional<movie> findMovieByImdbId(String imdbID);

    Optional<movie>  findMovieByTitle(String title);

}
