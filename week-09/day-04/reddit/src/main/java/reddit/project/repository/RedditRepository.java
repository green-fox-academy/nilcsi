package reddit.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import reddit.project.Model.Post;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface RedditRepository extends CrudRepository<Post, Long> {
  List<Post> findAll();

  Post findAllById(Long id);
}
