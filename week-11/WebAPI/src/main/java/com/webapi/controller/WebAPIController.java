package com.webapi.controller;

import com.webapi.model.Weather;
import com.webapi.service.WebAPIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebAPIController {
  private WebAPIService webAPIService;

  public WebAPIController(WebAPIService webAPIService) {
    this.webAPIService = webAPIService;
  }

  @GetMapping("/")
  public String homePage() {
    return "index";
  }

  @GetMapping("/login")
  public String login() {
    return "auth/login";
  }
 /* @GetMapping("/measure")
  public String add(Model model) {
    model.addAttribute("weather", new Weather());
    return "add";
}

  @PostMapping("/measure")
  public String addMeasure(@ModelAttribute Weather weather) {
    webAPIService.saveMeasure(weather);
    return "list";
  }

  @GetMapping("/list")
  public String listAll(Model model){
    model.addAttribute("weather", webAPIService.getAllMeasure());
    return "list";
  }*/
}
