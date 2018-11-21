package com.aircraftCarrier;

public class F16 extends Aircrafts {

  F16() {
    type = "F16";
    maxAmmo = 8;
    baseDamage = 30;
    priority = false;
    maxDamage = damage * maxAmmo;
  }
}
