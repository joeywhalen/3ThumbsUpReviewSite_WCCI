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

        Movie movieOne = new Movie("bullit",
                "https://m.media-amazon.com/images/M/MV5BNWYxNzIxOTEtZWQyNS00OWY3LTgwNmMtMTI1MjI1MTE5OTZkXkEyXkFqcGdeQXVyNjUwMzI2NzU@._V1_.jpg",
                "https://www.youtube.com/embed/BsvD806qNM8",
                1968,
                "M/PG",
                true,
                "An all-guts, no-glory San Francisco cop becomes determined to find the underworld kingpin that killed the\n" +
                        "            witness in his protection.",
                5,
                actionGenre);

        Movie movieTwo = new Movie("Animal House",
                "https://images-na.ssl-images-amazon.com/images/I/71uWvrJr8KL._AC_SL1080_.jpg",
                "https://www.youtube.com/embed/KWjtI6n5xWM",
                1978,
                "R",
                true,"Faber College has one frat house so disreputable it will take anyone. It has a second one full of white," +
                "            anglo-saxon, rich young men who are so sanctimonious no one can stand them except Dean Wormer. The dean" +
                "            enlists the help of the second frat to get the boys of Delta House off campus. The dean's plan comes into" +
                "            play just before the homecoming parade to end all parades for all time.",
                5,
                comedyGenre);

        genreStorage.saveGenre(actionGenre);
        genreStorage.saveGenre(comedyGenre);
        genreStorage.saveGenre(documentaryGenre);
        genreStorage.saveGenre(dramaGenre);
        genreStorage.saveGenre(horrorGenre);
        genreStorage.saveGenre(suspenseGenre);

        movieStorage.saveMovie(movieOne);
        movieStorage.saveMovie(movieTwo);
    }
}
