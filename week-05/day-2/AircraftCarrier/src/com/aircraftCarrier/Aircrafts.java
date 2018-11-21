package com.aircraftCarrier;

public class Aircrafts {
    String type;
    int maxAmmo;
    int baseDamage;
    int currentAmmo;
    boolean priority;
    int maxDamage;
    int damage;

    public Aircrafts() {
        currentAmmo = 0;
    }
    public int fight() {
        int damageDone = currentAmmo *damage;
        currentAmmo = 0;
        return damageDone;
    }

    public int refill(int ammoToBeAdded) {
        int remainingAmmo;
        if(ammoToBeAdded < maxAmmo) {
            currentAmmo += ammoToBeAdded;
            remainingAmmo = 0;
        } else {
            currentAmmo = maxAmmo;
            remainingAmmo = ammoToBeAdded - maxAmmo;
        }
        return remainingAmmo;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
       return "Type: " + getType() + ", Ammo: " + currentAmmo + ", Base Damage: " + damage + ", All Damage: " + maxDamage;
    }

    public boolean isPriority() {
        return priority;
    }

    public int getMissingAmmo() {
        int missingAmmo = maxAmmo - currentAmmo;
        return missingAmmo;
    }

    public boolean needAmmo() {
        if(currentAmmo < maxAmmo) {
            return true;
        } else {
            return false;
        }
    }

    public int calculateDamage() {
        int damageDone = currentAmmo * damage;
        return damageDone;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
