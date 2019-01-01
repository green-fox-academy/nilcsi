package com.reddit.controller;

import com.reddit.model.Post;
import com.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PostController {

  private PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String listAllPost(Model model) {
    model.addAttribute("posts", postService.listPosts());
    return "index";
  }

  @GetMapping("/{id}/increase")
  public String increaseVote(@PathVariable long id) {
    Post post = postService.getPostById(id);
    postService.increaseVote(post);
    postService.editPost(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/decrease")
  public String decreaseVote(@PathVariable long id) {
    Post post = postService.getPostById(id);
    postService.decreaseVote(post);
    postService.editPost(post);
    return "redirect:/";
  }

  @GetMapping("/addpost")
  public String addNewPostForm(Model model) {
    model.addAttribute("posts", new Post());
    return "addpost";
  }

  @PostMapping("/addpost")
  public String addNewPost(@ModelAttribute Post post) {
    postService.editPost(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String editPostForm(Model model, @PathVariable long id) {
    model.addAttribute("post", postService.getPostById(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String editPost(Post post) {
    postService.editPost(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/delete")
  public String deletePost(@PathVariable long id) {
    postService.deletePost(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/showpost")
  public String showPost(@PathVariable long id, Model model) {
    model.addAttribute("post", postService.getPostById(id));
    return "showpost";
  }
}
