package org.wecancodeit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.pojos.Genre;
import org.wecancodeit.pojos.Hashtags;
import org.wecancodeit.storage.GenreStorage;
import org.wecancodeit.storage.MovieStorage;

@Controller
public class GenreController {

    private GenreStorage genreStorage;
    private MovieStorage movieStorage;

    public GenreController(GenreStorage genreStorage, MovieStorage movieStorage) {
        this.genreStorage = genreStorage;
        this.movieStorage = movieStorage;

    }

    @RequestMapping("/genres")
    public String displayAllGenres(Model model) {

        Iterable<Genre> allGenres = genreStorage.retrieveAllGenres();
        Iterable<Hashtags> allHashtags = movieStorage.retrieveAllHashtags();

        model.addAttribute("genres", allGenres);
        model.addAttribute("hashtags", allHashtags);

        return "all-genres";
    }

    @RequestMapping("genres/{name}")
    public String displaySingleGenre(Model model, @PathVariable String name) {

        Genre genre = genreStorage.retrieveGenreByName(name);
        Iterable<Hashtags> allHashtags = movieStorage.retrieveAllHashtags();

        model.addAttribute("genre", genre);
        model.addAttribute("hashtags", allHashtags);

        return "single-genre";
    }
}
