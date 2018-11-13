package com.FleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing numOne = new Thing("Get Milk");
        Thing numTwo = new Thing("Remove the obstacles");
        Thing numThree = new Thing("Stand up");
        Thing numFour = new Thing("Eat lunch");

        numThree.complete();
        numFour.complete();

        fleet.add(numOne);
        fleet.add(numTwo);
        fleet.add(numThree);
        fleet.add(numFour);

        System.out.println(fleet);

    }
}