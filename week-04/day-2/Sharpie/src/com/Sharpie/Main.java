package com.Sharpie;

public class Main {

    public static void main(String[] args) {
        Sharpie numOne = new Sharpie("blue", 13);
        numOne.use();
        numOne.use();
        numOne.use();
        System.out.println(numOne.inkAmount);
    }
}

