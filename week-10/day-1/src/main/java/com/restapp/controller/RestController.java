package com.restapp.controller;

import com.restapp.error.ErrorMessage;
import com.restapp.model.Doubled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam Integer input) {
    if(input != null) {
      return new Doubled(input);
    } else {
      return new ErrorMessage("Please provide an input!");
    }
  }

  //@GetMapping("/greeter")
}
