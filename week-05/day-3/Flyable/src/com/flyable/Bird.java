package com.flyable;

public class Bird extends Animals implements Flyable {

  Bird() {
    super.name = name;
  }

  Bird(String name) {
    this.name = name;
  }

  public String breed() {
    return "laying eggs.";
  }

  public void land() {}

  public void fly() {}
}
