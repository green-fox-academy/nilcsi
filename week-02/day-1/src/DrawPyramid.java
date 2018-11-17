import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        System.out.println("Please, give me a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

           for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

           for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
           }
           System.out.println("");
        }
    }
}
