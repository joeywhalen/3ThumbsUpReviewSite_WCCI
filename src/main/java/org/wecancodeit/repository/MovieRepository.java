package org.wecancodeit.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    Movie findByTitle(String title);
}
