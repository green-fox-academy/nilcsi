package com.reddit;

import com.reddit.model.Post;
import com.reddit.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

  private PostRepository postRepository;

  public RedditApplication(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    postRepository.save(new Post("It works as we intended it to in Internet Explorer"));
    postRepository.save(new Post("Polish history in on a picture"));
    postRepository.save(new Post("Motion sensors are not installed the right way"));
    postRepository.save(new Post("The sign at my gym"));
  }
}

