package reddit.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import reddit.project.Model.Post;
import reddit.project.Service.RedditService;

@Controller
public class RedditController {
  private RedditService postService;

  public RedditController(RedditService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String getIndexPage(Model model) {
    model.addAttribute("postList", postService.getPostList());
    return "index";
  }

  @GetMapping("/submit")
  public String getSubmitPage(Model model) {
    model.addAttribute("post", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String submitNewPost(@ModelAttribute Post post) {
    postService.postSaver(post);
    return "redirect:/";
  }

  @GetMapping("/countInc/{id}")
  public String increasePostCount(@PathVariable(value = "id") Long id) {
    postService.countIncreaser(id);
    return "redirect:/";
  }

  @GetMapping("/countDec/{id}")
  public String decreasePostCount(@PathVariable(value = "id") Long id) {
    postService.countDecreaser(id);
    return "redirect:/";
  }
}
