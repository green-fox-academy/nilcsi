package com.webapi.service;

import com.webapi.model.Weather;

import java.util.List;

public interface WebAPIService {
  void saveMeasure(Weather weather);
  List<Weather> getAllMeasure();
}
