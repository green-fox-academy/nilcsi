import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        System.out.println("Please, give me a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = 1; k < n + 1; k++) {
                if (i % 2 == 0) {
                    System.out.print("% ");
                } else {
                    System.out.print(" %");
                }
            }System.out.println("");
        }
    }
}
