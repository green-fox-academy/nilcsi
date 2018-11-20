package com.gardenApp;

public class Flower extends Plant {

  Flower(String color) {
    this.color = color;
    this.waterNeeded = 5;
    this.waterAbsorb = 0.75;
    this.type = "flower";

  }
}
