package com.Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
  /*Create an Armada class
  Contains Ship-s as a list
  Have a armada.war(otherArmada) method where two armada can engage in war
  it should work like merge sort
  first ship from the first armada battles the first of the other
  the loser gets skipped so the next ship comes in play from that armada
  whichever armada gets to the end of its ships loses the war
  return true if this is the winner*/

  ArrayList<Ship> armada;
  String name;

  Armada(String name) {
    this.armada = new ArrayList<Ship>();
    this.name = name;
    fillWithShip();
  }

  public void fillWithShip() {
    for(int i = 0; i < (int) (Math.random() * 51); i++) {
      Ship newShip = new Ship();
      newShip.fillShip();
      armada.add(newShip);
    }
  }

  public String toString() {
    return "The armada has " + this.armada.size() + " ships and " + this.getScore() + " points.";
  }

  public Ship getShip(int n) {
    return this.armada.get(n);
  }

  public int getScore() {
    int sum = 0;
    for(Ship ship : armada) {
      sum += ship.score;
    }
    return sum;
  }

  public int size() {
    return armada.size();
  }

  public List remove(int index) {
    armada.remove(index);
    return armada;
  }

  public boolean war(Armada otherArmada) {
    while (armada.size() != 0 && otherArmada.size() != 0) {
      System.out.println(name + " Ship (score: " + armada.get(0).score + ") vs. " + otherArmada.name + " Ship (score: " + otherArmada.getShip(0).score + ")");
      if (armada.get(0).score >= otherArmada.getShip(0).score) {
        otherArmada.remove(0);
        armada.get(0).score--;
      } else {
        armada.remove(0);
        otherArmada.getShip(0).score--;
      }
    }
    if (armada.size() == 0) {
      System.out.println("The winner is: " + otherArmada.name);
      return false;
    } else {
      System.out.println("The winner is " + name);
      return true;
    }
  }
}
