package org.wecancodeit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.pojos.Genre;
import org.wecancodeit.pojos.Hashtags;
import org.wecancodeit.pojos.Movie;
import org.wecancodeit.repository.HashtagRepository;
import org.wecancodeit.storage.GenreStorage;
import org.wecancodeit.storage.MovieStorage;

@Component
public class Populator implements CommandLineRunner {
    private MovieStorage movieStorage;
    private GenreStorage genreStorage;
    private HashtagRepository hashtagRepository;


    public Populator(MovieStorage movieStorage, GenreStorage genreStorage, HashtagRepository hashtagRepository) {
        this.movieStorage= movieStorage;
        this.genreStorage = genreStorage;
        this.hashtagRepository = hashtagRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Genre actionGenre = new Genre("action");
        Genre comedyGenre = new Genre("comedy");
        Genre documentaryGenre = new Genre("documentary");
        Genre dramaGenre = new Genre("drama");
        Genre horrorGenre = new Genre("horror");
        Genre suspenseGenre = new Genre("suspense");

        Hashtags hashOne = new Hashtags("#CarChase");
        Hashtags hashTwo = new Hashtags("#BuddyMovie");
        Hashtags hashThree = new Hashtags("#Cheesy");
        Hashtags hashFour = new Hashtags("#Slasher");
        Hashtags hashFive = new Hashtags("#Violent");
        Hashtags hashSix = new Hashtags("#Funny");

        Hashtags hash7 = new Hashtags("#Wait...What?!");
        Hashtags hash8 = new Hashtags("#SleepWithTheLightsOn");
        Hashtags hash9 = new Hashtags("#Spooky");
        Hashtags hash10 = new Hashtags("#Boring");
        Hashtags hash11 = new Hashtags("#LoveStory");
        Hashtags hash12 = new Hashtags("#Vampires");
        hashtagRepository.save(hashOne);
        hashtagRepository.save(hashTwo);
        hashtagRepository.save(hashThree);
        hashtagRepository.save(hashFour);
        hashtagRepository.save(hashFive);
        hashtagRepository.save(hashSix);
        hashtagRepository.save(hash7);
        hashtagRepository.save(hash8);
        hashtagRepository.save(hash9);
        hashtagRepository.save(hash10);
        hashtagRepository.save(hash11);
        hashtagRepository.save(hash12);



        Movie bullit = new Movie("Bullit",
                "https://m.media-amazon.com/images/M/MV5BNWYxNzIxOTEtZWQyNS00OWY3LTgwNmMtMTI1MjI1MTE5OTZkXkEyXkFqcGdeQXVyNjUwMzI2NzU@._V1_.jpg",
                "https://www.youtube.com/embed/BsvD806qNM8",
                1968,
                "M/PG",
                true,
                "An all-guts, no-glory San Francisco cop becomes determined to find the underworld kingpin that killed the\n" +
                        "            witness in his protection.",
                4,
                actionGenre,
                hashOne,hashFive);

        Movie conAir = new Movie("Con Air",
                "https://images-na.ssl-images-amazon.com/images/I/514F8JgREKL._AC_.jpg",
                "https://www.youtube.com/embed/vYFU0H1I1i0",
                1987,
                "R",
                true,
                "Newly paroled ex-con and former U.S. Ranger Cameron Poe finds himself trapped in a prisoner transport\n" +
                        "                    plane when the passengers seize control.",
                4,
                actionGenre,
                hashOne,hashTwo,hashThree,hashFive);

        Movie dieHard = new Movie("Die Hard",
                "https://m.media-amazon.com/images/M/MV5BZjRlNDUxZjAtOGQ4OC00OTNlLTgxNmQtYTBmMDgwZmNmNjkxXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg",
                "https://www.youtube.com/embed/2TQ-pOvI6Xo",
                1988,
                "R",
                true,
                "An NYPD officer tries to save his wife and several others taken hostage by German terrorists during a\n" +
                        "                    Christmas party at the Nakatomi Plaza in Los Angeles.",
                5,
                actionGenre,
                hashFive,hashSix);

        Movie frenchConnection = new Movie("The French Connection",
                "https://cdn.shopify.com/s/files/1/1416/8662/products/french_connection_1971_linen_original_film_art_f_1200x.jpg?v=1582765548",
                "https://www.youtube.com/embed/T76K3RxJY0A",
                1971,
                "R",
                false,
                "A pair of NYC cops in the Narcotics Bureau stumble onto a drug smuggling job with a French\n" +
                        "                     connection.",
                4,
                actionGenre,
                hashOne,hashFive);

        Movie pointBreak = new Movie("Point Break",
                "https://images-na.ssl-images-amazon.com/images/I/815GLk-ggYL._AC_SL1500_.jpg",
                "https://www.youtube.com/embed/ZgHPumVN4Fo",
                1991,
                "R",
                true,
                "An F.B.I. Agent goes undercover to catch a gang of surfers who may be bank robbers.",
                4,
                actionGenre,
                hashTwo,hashThree,hashFive);

        Movie speed = new Movie("Speed",
                "https://cdn.shopify.com/s/files/1/0013/2874/2466/products/speed-get-ready-for-rush-hour-keanu-reeves-1994-vintage-movie-promo-poster-27-x-39-620_705x.jpg?v=1616623980",
                "https://www.youtube.com/embed/8piqd2BWeGI",
                1994,
                "R",
                true,
                "A young police officer must prevent a bomb exploding aboard a city bus by keeping its speed above 50 mph.",
                4,
                actionGenre,
                hashTwo,hashFive);


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
                "https://i5.walmartimages.com/asr/2f4a2cc0-2031-4531-b42f-6bf1c46c4e69_1.3a47dce8a1f16d836ab467f9e85ea03f.jpeg?odnWidth=612&odnHeight=612&odnBg=ffffff",
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
                "https://www.youtube.com/embed/cujiHDeqnHY",
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

        Movie fridayThe13th = new Movie("Friday the 13th",
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

        Movie texasChainsawMassacre = new Movie("The Texas Chainsaw Massacre",
                "https://cdn.shopify.com/s/files/1/1416/8662/products/texas_chainsaw_massacre_1974_linen_original_film_art_f_1200x.jpg?v=1620170535",
                "https://www.youtube.com/embed/HgJQvyngAeM",
                1974,
                "R",
                false,
                "Two siblings and three of their friends en route to visit their grandfather's grave in Texas fall\n" +
                        "                    victim to a family of cannibalistic psychopaths.",
                5,
                horrorGenre);

        Movie alien = new Movie("Alien",
                "https://m.media-amazon.com/images/I/41ltBoq45nL._AC_.jpg",
                "https://www.youtube.com/embed/Fuv1zokIqtE",
                1979,
                "R",
                true,
                "After a space merchant vessel receives an unknown transmission as a distress call, one of the\n" +
                        "                    crew is attacked by a mysterious life form and they soon realize that its life cycle has merely begun.",
                5,
                suspenseGenre);

        Movie blueVelvet = new Movie("Blue Velvet",
                "https://images-na.ssl-images-amazon.com/images/I/51q-uVPdv1L._AC_.jpg",
                "https://www.youtube.com/embed/k_BybDB_phY",
                1986,
                "R",
                true,
                "The discovery of a severed human ear found in a field leads a young man on an investigation\n" +
                        "                    related to a beautiful, mysterious nightclub singer and a group of psychopathic criminals who\n" +
                        "                    have kidnapped her child.",
                5,
                suspenseGenre);

        Movie deliverance = new Movie("Deliverance",
                "https://m.media-amazon.com/images/M/MV5BZjBhYzU3NWItOWZjMy00NjI5LWFmYmItZmIyOWFlMDIxMWNiXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg",
                "https://www.youtube.com/embed/ZrA1RC96LyY",
                1972,
                "R",
                false,
                "Intent on seeing the Cahulawassee River before it's dammed and turned into a lake, outdoor\n" +
                        "                    fanatic Lewis Medlock takes his friends on a canoeing trip they'll never forget into the\n" +
                        "                    dangerous American back-country.",
                4,
                suspenseGenre);

        Movie dogDayAfternoon = new Movie("Dog Day Afternoon",
                "https://cdn.shopify.com/s/files/1/0747/3829/products/HP3158_94883411-0c48-483e-bed6-580995428ae8_1024x1024.jpg?v=1571445155",
                "https://www.youtube.com/embed/Ne6KMHLTvik",
                1975,
                "R",
                true,
                "Three amateur bank robbers plan to hold up a bank. A nice simple robbery: Walk in, take the\n" +
                        "                    money, and run. Unfortunately, the supposedly uncomplicated heist suddenly becomes a bizarre\n" +
                        "                    nightmare as everything that could go wrong does.",
                4,
                suspenseGenre);

        Movie escapeFromAlcatraz = new Movie("Escape from Alcatraz",
                "https://m.media-amazon.com/images/M/MV5BNDQ3MzNjMDItZjE0ZS00ZTYxLTgxNTAtM2I4YjZjNWFjYjJlL2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_UY1200_CR80,0,630,1200_AL_.jpg",
                "https://www.youtube.com/embed/KSS0fH9zzFY",
                1979,
                "PG",
                true,
                "Alcatraz is the most secure prison of its time. It is believed that no one can ever escape from\n" +
                        "                    it, until three daring men make a possible successful attempt at escaping from one of the most\n" +
                        "                    infamous prisons in the world.",
                4,
                suspenseGenre);

        Movie jaws = new Movie("Jaws",
                "https://cdn.shopify.com/s/files/1/1057/4964/products/jaws-vintage-movie-poster-original-1-sheet-27x41-392_300x@2x.jpg?v=1618606829",
                "https://www.youtube.com/embed/U1fu_sA7XhE",
                1975,
                "PG",
                true,
                "When a killer shark unleashes chaos on a beach community, it's up to a local sheriff, a marine\n" +
                        "                    biologist, and an old seafarer to hunt the beast down.",
                5,
                suspenseGenre);

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
        movieStorage.saveMovie(fridayThe13th);
        movieStorage.saveMovie(halloween);
        movieStorage.saveMovie(shining);
        movieStorage.saveMovie(texasChainsawMassacre);

        movieStorage.saveMovie(alien);
        movieStorage.saveMovie(blueVelvet);
        movieStorage.saveMovie(deliverance);
        movieStorage.saveMovie(dogDayAfternoon);
        movieStorage.saveMovie(escapeFromAlcatraz);
        movieStorage.saveMovie(jaws);
    }
}
