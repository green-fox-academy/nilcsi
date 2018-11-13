package com.Farm;

public class Animal {

    int hunger = 50;
    int thirst = 50;

    Animal() {}

    public int eat(){

        return hunger --;
    }

    public int drink() {

        return thirst --;
    }

    public void play(){
        hunger ++;
        thirst ++;
    }

}
