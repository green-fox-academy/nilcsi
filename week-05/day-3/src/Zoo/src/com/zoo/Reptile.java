package com.zoo;

public class Reptile extends Animals {

  Reptile() {
    super.name = name;
  }

  Reptile(String name) {
    this.name = name;
  }

  public String breed() {
    return "laying eggs.";
  }
}
