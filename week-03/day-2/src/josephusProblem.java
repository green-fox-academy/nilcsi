import java.util.Scanner;

public class josephusProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me how many people are in the circle!");
        int number = input.nextInt();
        int leftSide = 2;
        System.out.println("You have to stend in position " + josephus(number, leftSide)+ " if you want to survive!");
    }

    public static int josephus(int number, int everySecond) {
        if (number == 1) {
            return 1;
        } else {
            return (josephus(number - 1, everySecond) + (everySecond - 1)) % number + 1;
        }
    }
}