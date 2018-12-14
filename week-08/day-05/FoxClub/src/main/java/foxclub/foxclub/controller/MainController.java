package foxclub.foxclub.controller;

import foxclub.foxclub.model.Fox;
import foxclub.foxclub.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  private FoxService foxService;

  public MainController(FoxService foxService) {

    this.foxService = foxService;
  }

  @RequestMapping("/")
  public String indexDefault() {
    return "index";
  }

  @GetMapping("/")
  public String showIndex(@RequestParam(required = false, value = "name") String foxName, Model model) {

    if (foxName != null) {
      model.addAttribute("fox", foxService.getFoxByName(foxName));
      return "index";
    } else if (!foxService.getFoxList().isEmpty()) {
      model.addAttribute("fox", foxService.getFoxByName(foxService.getFoxList().get(0).getName()));
      return "index";
    } else {
      return "redirect:/login";
    }
  }
}
