package foxclub.foxclub.controller;

import foxclub.foxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrickController {

  private FoxService foxService;

  @Autowired
  public TrickController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/trickcenter")
  public String trickCenter(Model model, @RequestParam(value = "name") String name) {
    model.addAttribute("fox", foxService.getFoxByName(name));
    return "trickcenter";
  }

  @PostMapping("/trickcenter")
  public String learTrick(@RequestParam("name") String name, @RequestParam("trick") String trick) {
    foxService.getFoxByName(name).addTrick(trick);
    return "redirect:/?name=" + name;
  }
}
