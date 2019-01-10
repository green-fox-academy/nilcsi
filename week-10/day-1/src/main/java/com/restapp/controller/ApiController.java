package com.restapp.controller;

import com.restapp.error.ErrorMessage;
import com.restapp.model.AppendA;
import com.restapp.model.Doubled;
import com.restapp.model.Greeter;
import com.restapp.model.Until;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if(input != null) {
      return new Doubled(input);
    } else {
      return new ErrorMessage("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if(name == null && title == null) {
      return new ErrorMessage("Please provide a name and a title!");
    } else if(name == null){
      return new ErrorMessage("Please provide a name!");
    } else if(title == null) {
      return new ErrorMessage("Please provide a title!");
    } else {
      return new Greeter(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable(value = "appendable", required = false) String appendable) {
    return new AppendA(appendable);
  }

  /*@PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable("action") String action, @RequestBody(required = false) Until until) {

  }*/
}
