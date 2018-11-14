package com.Pirates;

public class BattleApp {

  /*Create a BattleApp class with a main method
    Create 2 ships, fill them with pirates
    Have a battle!*/

  public static void main(String[] args) {
    Ship blackPearl = new Ship();
    Ship queenMary = new Ship();

    blackPearl.battle(queenMary);

    System.out.println("BlackPearl: " + blackPearl);
    System.out.println("Queen Mary: " + queenMary);
  }
}
