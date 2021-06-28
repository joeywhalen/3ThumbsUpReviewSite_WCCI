package org.wecancodeit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.pojos.Genre;
import org.wecancodeit.storage.GenreStorage;

@Controller
public class GenreController {
    private GenreStorage genreStorage;
    public GenreController(GenreStorage genreStorage) {this.genreStorage = genreStorage; }

    @RequestMapping("/genres")
    public String displayAllGenres(Model model){

        Iterable<Genre> allGenres = genreStorage.retrieveAllGenres();
        model.addAttribute("genres", allGenres);

        return "all-genres";
    }

    @RequestMapping("genres/{name}")
    public String displaySingleGenre(Model model, @PathVariable String name){

        Genre genre = genreStorage.retrieveGenreByName(name);
        model.addAttribute("genre", genre);

        return "single-genre";
    }
}
