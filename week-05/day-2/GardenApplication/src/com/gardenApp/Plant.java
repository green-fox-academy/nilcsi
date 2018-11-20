package com.gardenApp;

public class Plant {

  double waterLevel;
  String color;
  int waterNeeded;
  double waterAbsorb;
  String type;

  public Plant() {
    waterLevel = 0;
  }

  public boolean isItThirsty() {
    return (waterLevel < waterNeeded);
  }

  public void plantStatus() {
    if(isItThirsty()) {
      System.out.println("The " + color + " " + type + " needs water.");
    } else {
      System.out.println("The " + color + " " + type + " does not need water.");
    }
  }

  public void watering(double waterAmount) {
    if(isItThirsty()) {
      waterLevel += waterAmount * waterAbsorb;
    }
  }
}
