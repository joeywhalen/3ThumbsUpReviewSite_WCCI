package org.wecancodeit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    private MovieStorage movieStorage;
    private GenreStorage genreStorage;


    public Populator(MovieStorage movieStorage, GenreStorage genreStorage) {
        this.movieStorage= movieStorage;
        this.genreStorage = genreStorage;
    }

    @Override
    public void run(String... args) throws Exception {
        Genre actionGenre = new Genre("action");
        Genre comedyGenre = new Genre("comedy");
        Genre documentaryGenre = new Genre("documentary");
        Genre dramaGenre = new Genre("drama");
        Genre horrorGenre = new Genre("horror");
        Genre suspenseGenre = new Genre("suspense");
    }
}
