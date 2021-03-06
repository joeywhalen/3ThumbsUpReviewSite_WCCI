package org.wecancodeit.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.pojos.Genre;
import org.wecancodeit.repository.GenreRepository;

@Service
public class GenreStorage {

    private GenreRepository genreRepository;

    public GenreStorage(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }
    public Genre retrieveGenreByName(String name){
        return genreRepository.findByName(name);
    }

    public Genre retrieveGenreById(Long id) {
        return genreRepository.findById(id).get();
    }

    public void deleteGenreById(Long id) {
        genreRepository.deleteById(id);
    }

    public void saveGenre(Genre genreToAdd) {
        genreRepository.save(genreToAdd);
    }

    public Iterable<Genre> retrieveAllGenres() {
        return genreRepository.findAll();
    }
}
