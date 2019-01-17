package com.webapi.controller;

import com.webapi.model.Weather;
import com.webapi.service.WebAPIService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WebAPIRestController {

  private WebAPIService webAPIService;

  public WebAPIRestController(WebAPIService webAPIService) {
    this.webAPIService = webAPIService;
  }

  /*@GetMapping("/")
  public String index() {
    return "Hello!";
  }*/

  @PostMapping("/measure")
  public Weather createNewMeasure(@RequestBody Weather weather) {
    webAPIService.saveMeasure(weather);
    return weather;
  }

  @GetMapping("/measure")
  public List<Weather> getAllMeasure() {
    return webAPIService.getAllMeasure();
  }

}
