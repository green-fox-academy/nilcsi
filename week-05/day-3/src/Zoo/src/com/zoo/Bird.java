package com.zoo;

public class Bird extends Animals {

  Bird() {
    super.name = name;
  }

  Bird(String name) {
    this.name = name;
  }

  public String breed() {
    return "laying eggs.";
  }
}
