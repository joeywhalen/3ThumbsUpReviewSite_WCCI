package org.wecancodeit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.pojos.Genre;
import org.wecancodeit.pojos.Hashtags;
import org.wecancodeit.pojos.Movie;
import org.wecancodeit.repository.GenreRepository;
import org.wecancodeit.repository.HashtagRepository;
import org.wecancodeit.storage.GenreStorage;
import org.wecancodeit.storage.MovieStorage;

import java.util.Collection;
import java.util.Locale;
import java.util.Optional;

@Controller
public class MovieController {

    private MovieStorage movieStorage;
    private GenreStorage genreStorage;
    private HashtagRepository hashtagRepository;

    public MovieController(MovieStorage movieStorage, GenreStorage genreStorage) {
        this.movieStorage = movieStorage;
        this.genreStorage = genreStorage;

    }

    @RequestMapping("/movies")
    public String displayAllMovies(Model model) {

        Iterable<Movie> allMovies = movieStorage.retrieveAllMovies();
        model.addAttribute("movies", allMovies);

        return "all-movies";
    }

    @RequestMapping("movies/{title}")
    public String displaySingleMovie(Model model, @PathVariable String title) {

        Movie movieToDisplay = movieStorage.retrieveMovieByTitle(title);
        model.addAttribute("movie", movieToDisplay);

        return "single-review";
    }


    @PostMapping("/addreview")
    public String addMovieReview(Model model,
                                 @RequestParam String title,
                                 String posterUrl,
                                 String trailerUrl,
                                 int releaseDate,
                                 String mpaaRating,
                                 boolean dateMovie,
                                 String description,
                                 int starRating,
                                 String genre) {

        Movie movieToAdd = new Movie(title, posterUrl, trailerUrl, releaseDate, mpaaRating, dateMovie, description, starRating, genreStorage.retrieveGenreByName(genre));
        movieStorage.saveMovie(movieToAdd);
        model.addAttribute("movie", movieToAdd);

        return "single-review";
    }

@PostMapping("/add-hashtag/{title}")
    public String addHashtagToMovie(Model model, @RequestParam String hashtag, @PathVariable String title) {

        movieStorage.addHashtagToMovie(hashtag, title);



        Movie movieToModify = movieStorage.retrieveMovieByTitle(title);
        model.addAttribute("movie", movieToModify);

        return "single-review";
    }



@RequestMapping("/hashtags")
    public String displayAllHashtags(Model model) {

        Iterable<Hashtags> allHashtags = movieStorage.retrieveAllHashtags();

        model.addAttribute("hashtags", allHashtags);

        return "hashtags";

    }





    @RequestMapping("/hashtags/{id}")
    public String displaySingleHashTag(Model model, @PathVariable Long id) {

        Hashtags hashtagToDisplay = hashtagRepository.findById(id).get();


        model.addAttribute("hashtag", hashtagToDisplay);

        return "single-hashtag";
    }



}
