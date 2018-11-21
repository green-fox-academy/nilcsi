package com.zoo;

abstract public class Animals {
  String name;
  int age;

  Animals() {}

  Animals(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  abstract public String breed();
}
