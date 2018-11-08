import java.util.*;
import java.util.Scanner;

public class guessMyNumber {

    public static void main(String... args) {

        int number = (int) (Math.random() * 101);
        System.out.println(number);
        System.out.println("I've the number between 1-100. You have 5 lives.");
        System.out.println("Please, give me your guess: ");
        Scanner userInput = new Scanner(System.in);
        int guess = userInput.nextInt();
        int lives = 5;

        while(guess != number && lives-1 != 0) {
            if (guess > number) {
                System.out.println("Too high. You have" + " " + --lives + " " + "lives left.");
            } else if (guess < number) {
                System.out.println("Too low. You have" + " " + --lives + " " + "lives left.");
            }
            guess = userInput.nextInt();
        }
        if(lives > 0 && guess == number){
                System.out.println("Congratulations. You won!");
            } else {
            System.out.println("You're dead!");
        }
    }
}