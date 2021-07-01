package org.wecancodeit.pojos;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String userComment;

    @ManyToOne
    private Movie movies;

    public Comment(String userComment, Movie movies) {
        this.userComment = userComment;
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
        return userComment;
    }
}
