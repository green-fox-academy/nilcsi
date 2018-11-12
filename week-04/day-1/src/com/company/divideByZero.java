package com.company;
import java.util.Scanner;

public class divideByZero {

    public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
        System.out.println("Give me the divisor: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        div(number);
    }


    public static void div(int num){
        try {
            int result = 12 / num;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }
}
