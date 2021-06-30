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

    public Comment(String comment) {
        this.comment = comment;
    }

    protected Comment(){

    }


    public Long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }
}
