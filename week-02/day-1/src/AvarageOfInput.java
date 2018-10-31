import java.util.Scanner;

public class AvarageOfInput {

    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        int[] numbers = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            System.out.println("Please, give me a number: ");
            Scanner scanner = new Scanner(System.in);
            sum += scanner.nextInt();
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/numbers.length);
    }
}