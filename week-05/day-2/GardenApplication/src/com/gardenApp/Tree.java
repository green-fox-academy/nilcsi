package com.gardenApp;

public class Tree extends Plant {

  Tree(String color) {
    this.color = color;
    this.waterNeeded = 10;
    this.waterAbsorb = 0.4;
    this.type = "tree";
  }

}
