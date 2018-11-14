package com.Pirates;

public class WarApp {

  public static void main(String[] args) {
    Armada cabral = new Armada("Indian Cabral");
    cabral.fillWithShip();
    Armada nova = new Armada("Spanish Nova");
    nova.fillWithShip();

    System.out.println(cabral.name + " armada size is: " + cabral.size());
    System.out.println(nova.name + " armada size is: " + nova.size() + "\n");
    System.out.println("LET THE BATTLE BEGIN!");
    cabral.war(nova);
  }
}
