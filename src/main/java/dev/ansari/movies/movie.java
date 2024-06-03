package dev.ansari.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection="movies")
@Data   // setters and getters
@AllArgsConstructor  // constructor
@NoArgsConstructor  // default constructor
public class movie {
    @Id
    private ObjectId id;
    private  String imdbId;
    private String title;
    private  String releaseDate;
    private  String trailerLink;
    private String poster ;
    private List<String> genres;
    private  List<String>  backdrops;
    @DocumentReference
    private List<Review> reviewID;





}
