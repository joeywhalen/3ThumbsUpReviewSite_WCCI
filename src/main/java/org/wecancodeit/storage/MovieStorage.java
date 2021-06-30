package org.wecancodeit.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.pojos.Hashtags;
import org.wecancodeit.pojos.Movie;
import org.wecancodeit.repository.HashtagRepository;
import org.wecancodeit.repository.MovieRepository;

import java.util.Collection;



@Service
public class MovieStorage {

    private MovieRepository movieRepository;
    private HashtagRepository hashtagRepository;

    public MovieStorage(MovieRepository movieRepository, HashtagRepository hashtagRepository) {
        this.movieRepository = movieRepository;
        this.hashtagRepository = hashtagRepository;
    }

    //METHODS BELOW

    public Hashtags retrieveHashtagByID(Long id) {
        return hashtagRepository.findById(id).get();
    }


    public void addHashtagToMovie(String userHashtag, String title) {

        Hashtags tagToAdd = new Hashtags(userHashtag);

        Movie movieToUpdate = movieRepository.findByTitle(title);

        if (!hashtagRepository.existsByHashName(userHashtag)) {
            hashtagRepository.save(tagToAdd);
            System.out.println("The hashtag did not exist.");
        }

        tagToAdd = hashtagRepository.findByHashName(userHashtag);

        Collection<Hashtags> tagsToModify = movieToUpdate.getHashtags();

        tagsToModify.add(tagToAdd);

        movieRepository.save(movieToUpdate);

    }

    public Movie retrieveMovieByTitle(String title) {
        return movieRepository.findByTitle(title);
    }

    public Movie retrieveMovieById(Long id) {
        return movieRepository.findById(id).get();
    }

    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }

    public Movie saveMovie(Movie movieToAdd) {
        movieRepository.save(movieToAdd);
        return movieToAdd;
    }

    public Iterable<Movie> retrieveAllMovies() {
        return movieRepository.findAll();
    }

    public Iterable<Hashtags> retrieveAllHashtags() {
        return hashtagRepository.findAll();
    }


}
