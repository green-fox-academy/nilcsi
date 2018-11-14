package com.Pirates;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ship {
    /*The place for the Pirates

    Create a Ship class.
    The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
    When a ship is created it doesn't have a crew or a captain.
    The ship can be filled with pirates and a captain via fillShip() method.
    Filling the ship with a captain and random number of pirates.
    Ships should be represented in a nice way on command line including information about
    captains consumed rum, state (passed out / died)
    number of alive pirates in the crew
    Ships should have a method to battle other ships: ship.battle(otherShip)
    should return true if the actual ship (this) wins
    the ship should win if its calculated score is higher
    calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
    The loser crew has a random number of losses (deaths).
    The winner captain and crew has a party, including a random number of rum :)*/

    ArrayList<Pirates> crew;
    Pirates captain = new Pirates();

    int consumedRum = (int) (Math.random() * 15);
    int alivePirates = (int) (Math.random() * 51);
    int score = alivePirates - consumedRum;
    boolean win = false;

    Ship() {
        ArrayList<Pirates> pirates = new ArrayList<>();
        this.crew = pirates;
        fillShip();
    }

    public void fillShip() {
        crew.add(captain);
        for(int i = 0; i < alivePirates; i++) {
            crew.add(new Pirates());
        }
    }

    public String toString() {
      String status = "The captain " + captain.status() + " and drank " + captain.drunk + " rums.\n";
      status += "The ship has a crew of " + crew.size() + " seadogs.";
      return status;
    }

    public boolean battle(Ship otherShip) {
        if(this.score > otherShip.score) {
            this.win = true;
            int partyRum = (int) (Math.random() * 71);
          System.out.println("Black Pearl have a party with " + partyRum + " litres rum. Queen Mary lost.");
            return true;
        } else {
            otherShip.win = true;
            int numOfDeaths = (int) (Math.random() * 51);
            System.out.println("Black Pearl lost the battle with " + numOfDeaths + " deaths. Queen Mary won.");
            return false;
        }
    }
}
