package com.reddit.service;


import com.reddit.model.Post;

import java.util.List;

public interface PostService {
  List<Post> listPosts();
  void increaseVote(Post post);
  void decreaseVote(Post post);
  void deletePost(long id);
  void editPost(Post post);
  Post getPostById(long id);
}
