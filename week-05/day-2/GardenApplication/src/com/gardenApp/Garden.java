package com.gardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> garden;

  public Garden() {
    garden = new ArrayList();
  }

  public void addPlant(Plant plant) {
    garden.add(plant);
  }

  public int needWater() {
    int gotWater = 0;
    for(Plant plants : garden) {
      if(plants.isItThirsty())
        gotWater++;
    }
    return  gotWater;
  }

  public void getWater(int amount) {
    System.out.println("Watering with " + amount);
    double equalAmount = amount / needWater();
    for(Plant plant : garden) {
      plant.watering(equalAmount);
    }
  }

  public void showGarden() {
    for(Plant plant : garden) {
      plant.plantStatus();
    }
    System.out.println();
  }

    public static void main(String[] args) {

      Garden garden = new Garden();
      Flower yellowFlower = new Flower("yellow");
      garden.addPlant(yellowFlower);
      Flower blueFlower = new Flower("blue");
      garden.addPlant(blueFlower);
      Tree purpleTree = new Tree("purple");
      garden.addPlant(purpleTree);
      Tree orangeTree = new Tree("orange");
      garden.addPlant(orangeTree);

      garden.showGarden();
      for (int i = 0; i < 2; i++) {
        if (i == 0) {
          garden.getWater(40);
        } else {
          garden.getWater(70);
        }
        garden.showGarden();
      }
    }
}
