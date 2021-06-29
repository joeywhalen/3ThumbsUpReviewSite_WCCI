package org.wecancodeit.pojos;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    @Lob
    private String posterUrl;
    @Lob
    private String trailerUrl;
    private int releaseDate;
    private String mpaaRating;
    private boolean dateMovie;
    @Lob
    private String description;
    private int starRating;

    @ManyToOne
    private Genre genre;

    @ManyToMany
    private Collection<Hashtags> hashtags;

    public Movie() {

    }

    public Movie(String title, String posterUrl, String trailerUrl, int releaseDate, String mpaaRating,
                 boolean dateMovie, String description, int starRating, Genre genre, Hashtags... hashtags) {
        this.title = title;
        this.posterUrl = posterUrl;
        this.trailerUrl = trailerUrl;
        this.releaseDate = releaseDate;
        this.mpaaRating = mpaaRating;
        this.dateMovie = dateMovie;
        this.description = description;
        this.starRating = starRating;
        this.genre = genre;
        this.hashtags = Set.of(hashtags);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public boolean isDateMovie() {
        return dateMovie;
    }

    public String getDescription() {
        return description;
    }

    public int getStarRating() {
        return starRating;
    }

    public Genre getGenre() {
        return genre;
    }

    public Collection<Hashtags> getHashtags() {
        return hashtags;
    }

    public void setHashtags(Collection<Hashtags> hashtags) {
        this.hashtags = hashtags;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", posterUrl='" + posterUrl + '\'' +
                ", trailerUrl='" + trailerUrl + '\'' +
                ", releaseDate=" + releaseDate +
                ", mpaaRating='" + mpaaRating + '\'' +
                ", dateMovie=" + dateMovie +
                ", description='" + description + '\'' +
                ", starRating=" + starRating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return releaseDate == movie.releaseDate && dateMovie == movie.dateMovie && starRating ==
                movie.starRating && Objects.equals(id, movie.id) && Objects.equals(title, movie.title) &&
                Objects.equals(posterUrl, movie.posterUrl) && Objects.equals(trailerUrl, movie.trailerUrl) &&
                Objects.equals(mpaaRating, movie.mpaaRating) && Objects.equals(description, movie.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, posterUrl, trailerUrl, releaseDate, mpaaRating, dateMovie, description,
                starRating);
    }
}
