import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        int sum = 0;
        double average = 0.0;

        for(int i=0; i<5; i++) {
            System.out.println("Please, give me a number: ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();

            sum += number;

        } average = sum/5;
        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}