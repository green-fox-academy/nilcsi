package com.greenfoxacademy.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name) {
    Greeting greet = new Greeting(name);
    model.addAttribute("name", greet.getContent());
    model.addAttribute("name", greet.getId());

    return "greeting";
  }

}
