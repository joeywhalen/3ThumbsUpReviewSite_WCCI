package org.wecancodeit.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.pojos.Hashtags;

import java.util.Collection;

public interface HashtagRepository extends CrudRepository<Hashtags, Long> {

    Boolean existsByHashName(String hashName);

    Hashtags findByHashName(String hashName);

}
