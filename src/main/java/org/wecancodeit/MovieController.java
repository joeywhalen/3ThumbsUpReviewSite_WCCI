package org.wecancodeit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.repository.MovieRepository;
@Controller

public class MovieController {

    private MovieStorage movieStorage;
    public MovieController(MovieRepository movieRepository) {this.movieStorage = movieStorage; }

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

        return "movie";
    }
}
