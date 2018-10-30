import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("How many kilometers?");

        double userInput;
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextDouble();

       double oneMile = userInput * 0.62;

        System.out.println(oneMile);
    }
}