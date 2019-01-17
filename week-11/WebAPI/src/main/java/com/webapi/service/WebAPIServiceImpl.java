package com.webapi.service;

import com.webapi.model.Weather;
import com.webapi.repository.WebAPIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebAPIServiceImpl implements WebAPIService {

  private WebAPIRepository webAPIRepository;

  @Autowired
  public WebAPIServiceImpl(WebAPIRepository webAPIRepository) {
    this.webAPIRepository = webAPIRepository;
  }

  @Override
  public void saveMeasure(Weather weather) {
   webAPIRepository.save(weather);
  }

  @Override
  public List<Weather> getAllMeasure() {
    List<Weather> getList = new ArrayList<>();
    webAPIRepository.findAll().forEach(getList :: add);
    return getList;
  }
}
