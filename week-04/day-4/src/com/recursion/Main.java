package com.recursion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and counts down from n.
        System.out.println("loop: ");
        counter(5);
        System.out.println("recursive: ");
        recCounter(6);
    }

    public static void counter(int limit){
        for(int i = 0; i < limit; i++){
            System.out.println(i);
        }
    }

    public static void recCounter(int limit) {
      int i = 0;
      System.out.println(i);
      System.out.println(recCounter(limit, i + 1));
    }

  public static int recCounter(int limit, int currentValue) {
    System.out.println(currentValue);
    if(currentValue < limit) {
      System.out.println("parameter: " + currentValue);
      System.out.println("return value: " + recCounter(limit, currentValue + 1));
    }
    return currentValue;
  }
}
