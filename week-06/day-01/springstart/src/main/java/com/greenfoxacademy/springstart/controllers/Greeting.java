package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  static long id;
  String content;
  static AtomicLong countIds = new AtomicLong();

  public Greeting(String content) {
    this.id = countIds.getAndIncrement();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

}
