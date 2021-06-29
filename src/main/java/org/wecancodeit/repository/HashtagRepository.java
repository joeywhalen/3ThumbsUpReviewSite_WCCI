package org.wecancodeit.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.pojos.Hashtags;

public interface HashtagRepository extends CrudRepository<Hashtags, Long> {

    Boolean existsByHashName(String hashName);



}
