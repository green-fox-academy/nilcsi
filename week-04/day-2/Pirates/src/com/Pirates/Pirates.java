package com.Pirates;

import java.util.List;
/* Create a Pirate class. While you can add other fields and methods, you must have these methods:-

         drinkSomeRum() - intoxicates the Pirate some
 howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
         0 to 4 times, "Pour me anudder!"
else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
         If you manage to get this far, then you can try to do the following.

 die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
 brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
 And... if you get that far...

 Add a parrot.*/

public class Pirates {

    boolean isPassedOut = false;
    boolean isDead = true;
    int drunk = (int)(Math.random() * 10);
    //parrot = new Parrot();

    public void drinkSomeRum() {
        if (isDead) {
            System.out.println("I'm dead");
        } else {
            this.drunk++;
        }
    }

    public void howsItGoingMate() {
      if(isDead) {
        System.out.println("I'm dead.");
      } else {
        if (drunk <= 4) {
          System.out.println("Pour me anudder!");
        } else {
          System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
      }
    }

    public void die() {

      isDead = true;
    }

    public void passOut(){
      isPassedOut = true;
      this.drunk = 0;
    }

    public String status() {
        if (isDead) {
            return "is dead";
        }
        if (isPassedOut) {
            return "is passed out";
        } else return "is OK";
    }

    public void brawl(Pirates otherPirate) {
        int dieNumber = (int)(Math.random() * 2);
        if (isDead) {
            switch (dieNumber) {
                case 0:
                    this.die();
                    break;
                case 1:
                    otherPirate.die();
                    break;
                case 2:
                    this.die();
                    otherPirate.die();
                    break;
            }
        }
    }
}
