package org.wecancodeit.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.Genre;

public interface GenreRepository extends CrudRepository<Genre, Long> {
}
