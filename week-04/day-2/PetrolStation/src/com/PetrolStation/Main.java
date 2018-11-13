package com.PetrolStation;

public class Main {
    public static void main (String args[]) {
        Car myAudiA3 = new Car();
        myAudiA3.capacity = 15;
        myAudiA3.carGasAmount = 30;

        Car notMyBmw = new Car();
        notMyBmw.carGasAmount = 5;
        notMyBmw.capacity = 30;

        Station mol = new Station();

        mol.refill(myAudiA3);

        System.out.println("Audi: " + myAudiA3.carGasAmount);
        System.out.println("BMW: " + notMyBmw.carGasAmount);
    }
}
