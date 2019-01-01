package com.reddit.service;

import com.reddit.model.Post;
import com.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  private PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> listPosts() {
    List<Post> posts = new ArrayList<>();
    postRepository.findAll().forEach(posts :: add);
    return posts;
  }

  @Override
  public void increaseVote(Post post) {
    post.setVote(post.getVote() + 1);
  }

  @Override
  public void decreaseVote(Post post) {
    post.setVote(post.getVote() - 1);
  }

  @Override
  public void deletePost(long id) {
    postRepository.deleteById(id);
  }

  @Override
  public void editPost(Post post) {
    postRepository.save(post);
  }

  @Override
  public Post getPostById(long id) {
    return postRepository.findById(id).orElse(null);
  }
}
