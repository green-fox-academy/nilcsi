package usefulutilities.usefulutilities.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index {

  @GetMapping("/useful")
  public String useful(Model model) {
    model.addAttribute("text", text);
    return "useful";
  }
}
