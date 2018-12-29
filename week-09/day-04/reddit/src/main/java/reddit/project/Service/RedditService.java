package reddit.project.Service;

import reddit.project.Model.Post;

import java.util.List;

public interface RedditService {

  List<Post> getPostList();

  void countIncreaser(Long id);

  void countDecreaser(Long id);

  void postSaver(Post post);
}
