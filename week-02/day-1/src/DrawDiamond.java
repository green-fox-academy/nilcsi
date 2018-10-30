import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        System.out.println("Please, give me a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (i + j <= n) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}