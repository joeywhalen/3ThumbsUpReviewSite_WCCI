package org.wecancodeit.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.pojos.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
