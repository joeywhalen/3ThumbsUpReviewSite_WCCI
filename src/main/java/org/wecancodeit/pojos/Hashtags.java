package org.wecancodeit.pojos;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Hashtags {

    @Id
    @GeneratedValue
    private Long id;
    private String hashName;

    @ManyToMany(mappedBy = "hashtags")
    private Set<Movie> movies;


    public Hashtags(String hashName) {
        this.hashName = hashName;
    }

    protected Hashtags() {

    }

    public Long getId() {
        return id;
    }

    public String getHashName() {
        return hashName;
    }

    public Set<Movie> getMovies() {
        return movies;
    }



}
