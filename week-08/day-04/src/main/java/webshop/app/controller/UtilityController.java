package webshop.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import webshop.app.Service.UtilityService;

@Controller
public class UtilityController {

  UtilityService utilityService;

  @GetMapping(value="/useful")
  public String returnIndex() {
    return "index";
  }

  @GetMapping(value="/useful/colored")
  public String coloredBackground(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping(value="/useful/email")
  public String validEmail(@RequestParam(value="email") String address, Model model) {
    if(utilityService.isValidEmail(address)) {
      model.addAttribute("check", address + " is a valid e-mail address!");
      model.addAttribute("color", "green");
    } else {
      model.addAttribute("check", address + " is not a valid e-mail address");
      model.addAttribute("color", "red");
    }
    return "email";
  }
}
