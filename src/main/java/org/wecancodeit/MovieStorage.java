package org.wecancodeit;

import org.springframework.stereotype.Service;
import org.wecancodeit.repository.MovieRepository;

@Service
public class MovieStorage {

    private MovieRepository movieRepository;

    public Movie retrieveMovieByTitle(String title){
        return movieRepository.findByTitle(title);
    }

    public MovieStorage(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
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
}
