package com.aircraftCarrier;

public class F35 extends Aircrafts {

  F35() {
    type = "F35";
    maxAmmo = 12;
    baseDamage = 50;
    priority = true;
    maxDamage = damage * maxAmmo;
  }
}
