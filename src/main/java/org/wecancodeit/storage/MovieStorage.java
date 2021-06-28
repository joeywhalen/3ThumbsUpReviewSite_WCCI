package org.wecancodeit.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.pojos.Hashtags;
import org.wecancodeit.pojos.Movie;
import org.wecancodeit.repository.HashtagRepository;
import org.wecancodeit.repository.MovieRepository;

@Service
public class MovieStorage {

    private MovieRepository movieRepository;
    private HashtagRepository hashtagRepository;

    public MovieStorage(MovieRepository movieRepository,HashtagRepository hashtagRepository) {
        this.movieRepository = movieRepository;
        this.hashtagRepository = hashtagRepository;
    }




    public Movie retrieveMovieByTitle(String title){
        return movieRepository.findByTitle(title);
    }



    public Movie retrieveMovieById(Long id) {
        return movieRepository.findById(id).get();
    }

    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }

    public void saveMovie(Movie movieToAdd) {
        movieRepository.save(movieToAdd);
    }

    public Iterable<Movie> retrieveAllMovies() {
        return movieRepository.findAll();
    }

    public Iterable<Hashtags> retrieveAllHashtags() {
        return hashtagRepository.findAll();


    }


}
