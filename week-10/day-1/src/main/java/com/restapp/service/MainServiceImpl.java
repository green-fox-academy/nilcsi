package com.restapp.service;

import com.restapp.model.Log;
import com.restapp.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

  private LogRepository logRepository;

  @Autowired
  public MainServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public void saveLog(Log log) {
    logRepository.save(log);
  }

  @Override
  public List<Log> listLogs() {
    return logRepository.findAll();
  }
}
