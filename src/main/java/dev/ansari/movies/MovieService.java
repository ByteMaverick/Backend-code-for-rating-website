package dev.ansari.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {


    @Autowired
    private MovieRepository movieRepository;

    public List<movie> allMovies(){

        return movieRepository.findAll();

    }

    public Optional<movie> singleMovie(String imdbId){
        return  movieRepository.findMovieByImdbId(imdbId);
    }


}
