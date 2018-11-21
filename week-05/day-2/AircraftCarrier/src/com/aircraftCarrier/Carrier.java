package com.aircraftCarrier;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Carrier {

  List<Aircrafts> aircrafts;
  int ammoStorage;
  int healthPoint;

  Carrier(int initialAmmo, int healthPoint) {
    ammoStorage = initialAmmo;
    this.healthPoint = healthPoint;
    aircrafts = new ArrayList();
  }

  public void add(Aircrafts aircraft) {
    aircrafts.add(aircraft);
  }

  public int calculateAmmo() {
    int ammoNeeded = 0;
    for(Aircrafts aircraft : aircrafts) {
      if(aircraft.needAmmo()) {
        ammoNeeded += aircraft.getMissingAmmo();
      }
    }
    return ammoNeeded;
  }

  public void fillWithPriority() {
    for(Aircrafts aircraft : aircrafts) {
      if(aircraft.isPriority()) {
        ammoStorage = aircraft.refill(ammoStorage);
      }
    }
    if(ammoStorage != 0) {
      for(Aircrafts aircraft : aircrafts) {
        if(!aircraft.isPriority()) {
          ammoStorage = aircraft.refill(ammoStorage);
        }
      }
    }
  }

  public void fillAll() {
    if(ammoStorage == 0) {
      throw new EmptyStackException();
    } else if (ammoStorage >= calculateAmmo()) {
      for(Aircrafts aircraft : aircrafts)
        ammoStorage = aircraft.refill(ammoStorage);
    } else {
      fillWithPriority();
    }
  }

  public void fight(Carrier otherCarrier) {
    int damageOutput = 0;
    for(Aircrafts aircraft : aircrafts) {
      damageOutput+= aircraft.fight();
    }
    otherCarrier.healthPoint -= damageOutput;
  }

  public int calculateMaxDamage() {
    int maxDamage = 0;
    for(Aircrafts aircraft : aircrafts) {
      maxDamage += aircraft.calculateDamage();
    }
    return  maxDamage;
  }

  public String getStatus() {
    String status = "HP: " + healthPoint + ", Aircraft count: " + aircrafts.size() + ", Ammo storage: " + ammoStorage + ", Total damage: " + calculateMaxDamage() + "\n"
        + "Aircrafts:\n";
    if (healthPoint > 0) {
      for (Aircrafts aircraft : aircrafts) {
        status += aircraft.getStatus() + "\n";
      }
    } else {
      status = "It's dead, Jim! :(";
    }
    return status;
  }
}
