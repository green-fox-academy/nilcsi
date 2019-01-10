package com.restapp.service;

import com.restapp.model.Log;
import com.restapp.repository.LogRepository;

import java.util.List;

public interface MainService {
  void saveLog(Log log);
  List<Log> listLogs();
}
