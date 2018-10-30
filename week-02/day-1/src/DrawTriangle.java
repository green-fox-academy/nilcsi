import java.util.Scanner;
import java.io.*;

public class DrawTriangle {
    public static void main(String[] args) {
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

        System.out.println("Please, give me a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
    }
}