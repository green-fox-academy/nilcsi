package com.zoo;

public class Mammal extends Animals {

  Mammal() {
    super.name = name;
  }

  Mammal(String name) {
    this.name = name;
  }

  public String breed() {
    return "pushing miniature versions out.";
  }
}
