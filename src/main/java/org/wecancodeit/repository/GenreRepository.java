package org.wecancodeit.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.pojos.Genre;

public interface GenreRepository extends CrudRepository<Genre, Long> {

    Genre findByName(String name);
}
