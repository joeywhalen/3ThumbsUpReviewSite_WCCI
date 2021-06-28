package org.wecancodeit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.pojos.Hashtags;
import org.wecancodeit.pojos.Movie;
import org.wecancodeit.storage.MovieStorage;

@Controller
public class MovieController {

    private MovieStorage movieStorage;
    public MovieController(MovieStorage movieStorage) {
        this.movieStorage = movieStorage ;

    }

    @RequestMapping("/movies")
    public String displayAllMovies(Model model){

        Iterable<Movie> allMovies = movieStorage.retrieveAllMovies();
        model.addAttribute("movies", allMovies);

        return "all-movies";
    }

    @RequestMapping("movies/{title}")
    public String displaySingleMovie(Model model, @PathVariable String title){

        Movie movieToDisplay = movieStorage.retrieveMovieByTitle(title);
        model.addAttribute("movie", movieToDisplay);

        return "single-review";
    }

    @PostMapping("/addreview")
    public String addMovieReview(Model model, @PathVariable Movie movieToAdd) {
        Movie reviewToAdd = movieStorage.saveMovie(movieToAdd);
        model.addAttribute("movie", movieToAdd);

        return "add-review";
    }

    @RequestMapping("/hashtags")
    public String displayAllHashtags(Model model) {

        Iterable<Hashtags> allHashtags = movieStorage.retrieveAllHashtags();

        model.addAttribute("hashtags", allHashtags);

        return "hashtags";

    }
}
