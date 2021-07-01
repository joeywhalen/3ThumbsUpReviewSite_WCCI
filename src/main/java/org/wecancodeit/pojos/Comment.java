package org.wecancodeit.pojos;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String comment;

    @ManyToOne
    private Movie movies;

    public Comment(String comment, Movie movies) {
        this.comment = comment;
        this.movies = movies;
    }

    protected Comment(){

    }

    public Movie getMovies() {
        return movies;
    }

    public Long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }
}
