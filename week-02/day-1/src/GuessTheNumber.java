import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        int guessWhat = 18;
        int guess;


        Scanner scan = new Scanner(System.in);

        boolean win = false;

        while (win == false) {
            System.out.println("Please, give me a guess: ");
            guess = scan.nextInt();

            if (guessWhat > guess) {
                System.out.println("The stored number is higher");
            } else if (guessWhat < guess) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number: " + guessWhat);
                win = true;
            }
        }
    }
}