package reddit.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reddit.project.Model.Post;
import reddit.project.repository.RedditRepository;

import java.util.List;

@Service
public class RedditServiceImpl implements RedditService {
  private RedditRepository postRepository;

  public RedditServiceImpl(RedditRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> getPostList() {
    return postRepository.findAll();
  }

  @Override
  public void countIncreaser(Long id) {
    Post post = postRepository.findAllById(id);
    post.setCount(post.getCount() + 1);
    postRepository.save(post);
  }

  @Override
  public void countDecreaser(Long id) {
    Post post = postRepository.findAllById(id);
    if (post.getCount() > 0) {
      post.setCount(post.getCount() - 1);
    }
    postRepository.save(post);
  }

  @Override
  public void postSaver(Post post) {
    postRepository.save(post);
  }
}
