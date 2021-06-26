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

        Movie bullit = new Movie("Bullit",
                "https://m.media-amazon.com/images/M/MV5BNWYxNzIxOTEtZWQyNS00OWY3LTgwNmMtMTI1MjI1MTE5OTZkXkEyXkFqcGdeQXVyNjUwMzI2NzU@._V1_.jpg",
                "https://www.youtube.com/embed/BsvD806qNM8",
                1968,
                "M/PG",
                true,
                "An all-guts, no-glory San Francisco cop becomes determined to find the underworld kingpin that killed the\n" +
                        "            witness in his protection.",
                4,
                actionGenre);

        Movie conAir = new Movie("Con Air",
                "https://images-na.ssl-images-amazon.com/images/I/514F8JgREKL._AC_.jpg",
                "https://www.youtube.com/embed/vYFU0H1I1i0",
                1987,
                "R",
                true,
                "Newly paroled ex-con and former U.S. Ranger Cameron Poe finds himself trapped in a prisoner transport\n" +
                        "                    plane when the passengers seize control.",
                4,
                actionGenre);

        Movie dieHard = new Movie("Die Hard",
                "https://m.media-amazon.com/images/M/MV5BZjRlNDUxZjAtOGQ4OC00OTNlLTgxNmQtYTBmMDgwZmNmNjkxXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg",
                "https://www.youtube.com/embed/2TQ-pOvI6Xo",
                1988,
                "R",
                true,
                "An NYPD officer tries to save his wife and several others taken hostage by German terrorists during a\n" +
                        "                    Christmas party at the Nakatomi Plaza in Los Angeles.",
                5,
                actionGenre);

        Movie frenchConnection = new Movie("The French Connection",
                "https://cdn.shopify.com/s/files/1/1416/8662/products/french_connection_1971_linen_original_film_art_f_1200x.jpg?v=1582765548",
                "https://www.youtube.com/embed/T76K3RxJY0A",
                1971,
                "R",
                false,
                "A pair of NYC cops in the Narcotics Bureau stumble onto a drug smuggling job with a French\n" +
                        "                     connection.",
                4,
                actionGenre);

        Movie pointBreak = new Movie("Point Break",
                "https://images-na.ssl-images-amazon.com/images/I/815GLk-ggYL._AC_SL1500_.jpg",
                "https://www.youtube.com/embed/ZgHPumVN4Fo",
                1991,
                "R",
                true,
                "An F.B.I. Agent goes undercover to catch a gang of surfers who may be bank robbers.",
                4,
                actionGenre);

        Movie speed = new Movie("Speed",
                "https://cdn.shopify.com/s/files/1/0013/2874/2466/products/speed-get-ready-for-rush-hour-keanu-reeves-1994-vintage-movie-promo-poster-27-x-39-620_705x.jpg?v=1616623980",
                "https://www.youtube.com/embed/8piqd2BWeGI",
                1994,
                "R",
                true,
                "A young police officer must prevent a bomb exploding aboard a city bus by keeping its speed above 50 mph.",
                4,
                actionGenre);


        Movie animalHouse = new Movie("Animal House",
                "https://images-na.ssl-images-amazon.com/images/I/71uWvrJr8KL._AC_SL1080_.jpg",
                "https://www.youtube.com/embed/KWjtI6n5xWM",
                1978,
                "R",
                true,
                "Faber College has one frat house so disreputable it will take anyone. It has a second one full of white," +
                "            anglo-saxon, rich young men who are so sanctimonious no one can stand them except Dean Wormer. The dean" +
                "            enlists the help of the second frat to get the boys of Delta House off campus. The dean's plan comes into" +
                "            play just before the homecoming parade to end all parades for all time.",
                5,
                comedyGenre);

        Movie blazingSaddles = new Movie("Blazing Saddles",
                "https://m.media-amazon.com/images/I/619D2L7hP7L._AC_.jpg",
                "https://www.youtube.com/embed/VKayG1TrfuE",
                1974,
                "R",
                true,
                "In order to ruin a western town, a corrupt politician appoints a black Sheriff, who promptly becomes his most formidable adversary.",
                5,
                comedyGenre);

        Movie caddyshack = new Movie("Caddyshack",
                "https://m.media-amazon.com/images/I/71GDGwQnd8L._AC_SS450_.jpg",
                "https://www.youtube.com/embed/x9Nl39uWEYk",
                1988,
                "R",
                true,
                "An exclusive golf course has to deal with a brash new member and a destructive dancing gopher.",
                5,
                comedyGenre);

        Movie upInSmoke = new Movie("Cheech & Chong's Up in Smoke",
                "https://images-na.ssl-images-amazon.com/images/I/716L2b9mjkL._AC_SY879_.jpg",
                "https://www.youtube.com/embed/k2pXxHW1DHs",
                1978,
                "R",
                true,
                "Two stoners unknowingly smuggle a van - made entirely of marijuana - from Mexico to L.A., with incompetent Sgt. Stedenko on their trail.",
                4,
                comedyGenre);

        Movie fastTimes = new Movie("Fast Times at Ridgemont High",
                "https://m.media-amazon.com/images/I/51WkGCvT5QL._AC_.jpg",
                "https://www.youtube.com/embed/vzva_I8WPAg",
                1982,
                "R",
                true,
                "A group of Southern California high school students are enjoying their most important subjects: sex, drugs, and rock n' roll.",
                5,
                comedyGenre);

        Movie slapShot = new Movie("Slap Shot",
                "https://images-na.ssl-images-amazon.com/images/I/51Ae33kOtpL._AC_SY450_.jpg",
                "https://www.youtube.com/embed/MUuEWI6F3dQ",
                1977,
                "R",
                true,
                "A failing ice hockey team finds success with outrageously violent hockey goonery.",
                4,
                comedyGenre);

        Movie declineWestern = new Movie("The Decline of Western Civilization",
                "https://upload.wikimedia.org/wikipedia/en/thumb/f/f9/The_Decline_of_Western_Civilization_film_poster.jpg/220px-The_Decline_of_Western_Civilization_film_poster.jpg",
                "https://www.youtube.com/embed/aiCTq_AHcqw",
                1981,
                "NR",
                false,
                "A look into the Los Angeles punk rock scene, that was largely ignored by the rock music press of the time.",
                4,
                documentaryGenre);

        Movie gimmeShelter = new Movie("Gimme Shelter",
                "https://cdn3.volusion.com/bxqxk.xvupj/v/vspfiles/photos/ONESHEET1093-2.jpg?v-cache=1350488637",
                "https://www.youtube.com/embed/x7UsBmavjsE",
                1970,
                "GP",
                false,
                "When three hundred thousand members of the Love Generation collided with a few dozen Hells Angels at\n" +
                        "                    San Francisco's Altamont Speedway, the bloody slash that transformed a decade's dreams into\n" +
                        "                    disillusionment was immortalized on this film.",
                4,
                documentaryGenre);

        Movie rogerAndMe = new Movie("Roger & Me",
                "https://dtvimages.hs.llnwd.net/e1//db_photos/movies/AllPhotosAPGI/101410/101410_aa.jpg",
                "https://www.youtube.com/embed/gOwXkstRaBw",
                1989,
                "R",
                false,
                "After General Motors closes its factory in Flint, Michigan, eliminating 35,000 jobs, filmmaker\n" +
                        "                    Michael Moore undertakes a quixotic quest to interview General Motors' chairman, Roger B. Smith.",
                4,
                documentaryGenre);

        Movie stopMakingSense = new Movie("Stop Making Sense",
                "https://images-na.ssl-images-amazon.com/images/I/716L2b9mjkL._AC_SY879_.jpg",
                "https://www.youtube.com/embed/yCXT5Fs-V10",
                1984,
                "NR",
                true,
                "An innovative concert movie for the rock group Talking Heads.",
                5,
                documentaryGenre);

        Movie thinBlueLine = new Movie("The Thin Blue Line",
                "https://cdn.shopify.com/s/files/1/1416/8662/products/ThinBlueLine_1988_original_film_art_600x.jpg?v=1617376327",
                "https://www.youtube.com/embed/dNL5A4D0G4g",
                1988,
                "NR",
                false,
                "A film that successfully argued that a man was wrongly convicted for murder by a corrupt justice system in Dallas County, Texas.",
                5,
                documentaryGenre);

        Movie timesOfHarveyMilk = new Movie("The Times of Harvey Milk",
                "https://cdn.cinematerial.com/p/297x/whtqjh0a/the-times-of-harvey-milk-german-movie-poster-md.jpg?v=1456319871",
                "https://www.youtube.com/embed/Jet-Ubwk5l8",
                1984,
                "NR",
                true,
                "A documentary of the successful career and assassination of San Francisco's first elected gay city supervisor.",
                5,
                documentaryGenre);

        Movie godfather = new Movie("The Godfather",
                "https://i.pinimg.com/170x/75/a6/c0/75a6c0b2957f8dabee2bf6c4a64249a1.jpg",
                "https://www.youtube.com/embed/5DO-nDW43Ik",
                1972,
                "R",
                true,
                "An organized crime dynasty's aging patriarch transfers control of his clandestine empire to his reluctant son.",
                5,
                dramaGenre);

        Movie cuckoosNest = new Movie("One Flew Over the Cuckoo's Nest",
                "https://cdn.shopify.com/s/files/1/1416/8662/products/one_flew_over_the_cuckoos_nest_1975_australian_original_film_art_f_1200x.jpg?v=1584463320",
                "https://www.youtube.com/embed/OXrcDonY-B8",
                1975,
                "R",
                true,
                "A criminal pleads insanity and is admitted to a mental institution, where he rebels against the\n" +
                        "                    oppressive nurse and rallies up the scared patients.",
                5,
                dramaGenre);

        Movie ragingBull = new Movie("Raging Bull",
                "https://m.media-amazon.com/images/M/MV5BYjRmODkzNDItMTNhNi00YjJlLTg0ZjAtODlhZTM0YzgzYThlXkEyXkFqcGdeQXVyNzQ1ODk3MTQ@._V1_.jpg",
                "https://www.youtube.com/embed/yUp6d79WRVI",
                1980,
                "R",
                true,
                "The life of boxer Jake LaMotta, whose violence and temper that led him to the top in the ring\n" +
                        "                    destroyed his life outside of it.",
                5,
                dramaGenre);

        Movie rocky = new Movie("Rocky",
                "https://images-na.ssl-images-amazon.com/images/I/91VrZVIFMuL._AC_SL1500_.jpg",
                "https://www.youtube.com/embed/3VUblDwa648",
                1976,
                "PG",
                true,
                "A small-time boxer gets a supremely rare chance to fight a heavyweight champion in a bout in\n" +
                        "                    which he strives to go the distance for his self-respect.",
                5,
                dramaGenre);

        Movie taxiDriver = new Movie("Taxi Driver",
                "https://www.joblo.com/assets/images/oldsite/posters/images/full/taxi-driver-poster2.jpg",
                "https://www.youtube.com/embed/UUxD4-dEzn0",
                1976,
                "R",
                false,
                "A mentally unstable veteran works as a nighttime taxi driver in New York City, where the\n" +
                        "                    perceived decadence and sleaze fuels his urge for violent action by attempting to liberate a\n" +
                        "                    presidential campaign worker and an underage prostitute.",
                5,
                dramaGenre);

        Movie termsOfEndearment = new Movie("Terms of Endearment",
                "http://prodimage.images-bn.com/pimages/0032429274069_p0_v2_s1200x630.jpg",
                "https://www.youtube.com/embed/sSY3YUrdSJI",
                1983,
                "PG",
                true,
                "Follows hard-to-please Aurora looking for love, and her daughter's family problems.",
                4,
                dramaGenre);

        Movie eraserhead = new Movie("Eraserhead",
                "https://m.media-amazon.com/images/M/MV5BMDExYzg5YjQtMzE0Yy00OWJjLThiZTctMWI5MzhjM2RmNjA4L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_.jpg",
                "https://www.youtube.com/embed/oK-2_OsBe0s",
                1977,
                "NR",
                false,
                "Henry Spencer tries to survive his industrial environment, his angry girlfriend, and the\n" +
                        "                    unbearable screams of his newly born mutant child.",
                4,
                horrorGenre);

        Movie exorcist = new Movie("The Exorcist",
                "https://www.funkyzilla.com/ekmps/shops/6bba79/images/the-exorcist-vintage-movie-poster-mouse-mat.-horror-film-novelty-mouse-pad-10239-p.jpg",
                "https://www.youtube.com/embed/YDGw1MTEe9k",
                1973,
                "R",
                false,
                "When a 12-year-old girl is possessed by a mysterious entity, her mother seeks the help of two priests to save her.",
                5,
                horrorGenre);

        Movie fridaythe13th = new Movie("Friday the 13th",
                "https://cdn.shopify.com/s/files/1/1416/8662/products/friday_the_13th_1980_linen_original_film_art_f_75457272-c414-4725-8468-82c2a212f77e_1200x.jpg?v=1612308325",
                "https://www.youtube.com/embed/sAzkW7HFh5U",
                1980,
                "R",
                true,
                "A group of camp counselors are stalked and murdered by an unknown assailant while trying to\n" +
                        "                    reopen a summer camp which was the site of a child's drowning and a grisly double murder years before.",
                4,
                horrorGenre);

        Movie halloween = new Movie("Halloween",
                "https://cdn.shopify.com/s/files/1/1057/4964/products/halloween-vintage-movie-poster-original-1-sheet-27x41-7260.jpg?v=1602478849",
                "https://www.youtube.com/embed/T5ke9IPTIJQ",
                1978,
                "R",
                true,
                "Fifteen years after murdering his sister on Halloween night 1963, Michael Myers escapes from a\n" +
                        "                    mental hospital and returns to the small town of Haddonfield, Illinois to kill again.",
                5,
                horrorGenre);

        Movie shining = new Movie("The Shining",
                "https://images-na.ssl-images-amazon.com/images/I/61cwYyI-c0L._AC_SL1000_.jpg",
                "https://www.youtube.com/embed/S014oGZiSdI",
                1980,
                "R",
                true,
                "A family heads to an isolated hotel for the winter where a sinister presence influences the\n" +
                        "                    father into violence, while his psychic son sees horrific forebodings from both past and future.",
                4,
                horrorGenre);

        

        genreStorage.saveGenre(actionGenre);
        genreStorage.saveGenre(comedyGenre);
        genreStorage.saveGenre(documentaryGenre);
        genreStorage.saveGenre(dramaGenre);
        genreStorage.saveGenre(horrorGenre);
        genreStorage.saveGenre(suspenseGenre);

        movieStorage.saveMovie(bullit);
        movieStorage.saveMovie(conAir);
        movieStorage.saveMovie(dieHard);
        movieStorage.saveMovie(frenchConnection);
        movieStorage.saveMovie(pointBreak);
        movieStorage.saveMovie(speed);

        movieStorage.saveMovie(animalHouse);
        movieStorage.saveMovie(blazingSaddles);
        movieStorage.saveMovie(caddyshack);
        movieStorage.saveMovie(upInSmoke);
        movieStorage.saveMovie(fastTimes);
        movieStorage.saveMovie(slapShot);

        movieStorage.saveMovie(declineWestern);
        movieStorage.saveMovie(gimmeShelter);
        movieStorage.saveMovie(rogerAndMe);
        movieStorage.saveMovie(stopMakingSense);
        movieStorage.saveMovie(thinBlueLine);
        movieStorage.saveMovie(timesOfHarveyMilk);

        movieStorage.saveMovie(godfather);
        movieStorage.saveMovie(cuckoosNest);
        movieStorage.saveMovie(ragingBull);
        movieStorage.saveMovie(rocky);
        movieStorage.saveMovie(taxiDriver);
        movieStorage.saveMovie(termsOfEndearment);

        movieStorage.saveMovie(eraserhead);
        movieStorage.saveMovie(exorcist);
        movieStorage.saveMovie(fridaythe13th);
        movieStorage.saveMovie(halloween);

    }
}
