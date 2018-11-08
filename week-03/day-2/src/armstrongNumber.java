import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please, give me a number: ");
        String numString = userInput.nextLine();

        int number = Integer.parseInt(numString);
        int total = 0;
        int temp = number;

        for (int i = 0; i < numString.length(); i++) {
            total += Math.pow((double) (temp % 10), (double) numString.length());
            temp = temp / 10;
        }
        if (total == number) {
            System.out.println("The " + number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not a Armstrong number ");
        }
    }
}