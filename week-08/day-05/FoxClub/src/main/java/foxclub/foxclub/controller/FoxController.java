package foxclub.foxclub.controller;

import foxclub.foxclub.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
  private FoxService foxService;

  public FoxController(FoxService foxService) {
    this.foxService = foxService;
  }

  @RequestMapping("/nutritionstore")
  public String nutritionDefault(@RequestParam(value = "name") String foxName) {
    return "nutritionstore";
  }

  @GetMapping("/nutritionstore")
  public String nutrition(@RequestParam(required = false, value = "name") String name, Model model) {
    model.addAttribute("fox", foxService.getFoxByName(name));
    return "nutritionstore";
  }

  @PostMapping("/nutritionstore")
  public String nutritionUpdate(@RequestParam(required = false, value = "name") String foxName,
                                @RequestParam(required = false, value = "food") String food,
                                @RequestParam(required = false, value = "drink") String drink,
                                Model model) {

    foxService.getFoxByName(foxName).setFood(food);
    foxService.getFoxByName(foxName).setDrink(drink);
    model.addAttribute("fox", foxService.getFoxByName(foxName));

    return "redirect:/?name=" + foxName;
  }
}
