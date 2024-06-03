package dev.ansari.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class movieController {

    @Autowired
    private  MovieService movieService;

    @GetMapping
    public ResponseEntity <List<movie>> getAllMovies(){
        return  new ResponseEntity <List<movie>>(movieService.allMovies(),HttpStatus.OK);
    }
    @GetMapping("/{imdbID}")
     public  ResponseEntity <Optional<movie>> getSingleMovie(@PathVariable String imdbID ){
        return new ResponseEntity<Optional<movie>>(movieService.singleMovie(imdbID),HttpStatus.OK);
    }
}

