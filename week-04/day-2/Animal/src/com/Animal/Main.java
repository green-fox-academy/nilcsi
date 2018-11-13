package com.Animal;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal();
        System.out.println(cat.drink());

        Animal dog = new Animal();
        System.out.println(dog.eat());

        dog.play();
        System.out.println(dog.eat());
        dog.play();
        System.out.println(dog.hunger);

    }
}
