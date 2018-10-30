import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        System.out.println("How many chicken legs are there?");

        int chickenLegs;
        Scanner scanner = new Scanner(System.in);
        chickenLegs = scanner.nextInt();

        System.out.println("How many pig legs are there?");

        int pigLegs;
        Scanner scanner2 = new Scanner(System.in);
        pigLegs = scanner.nextInt();

        int sum = chickenLegs + pigLegs;
        System.out.println("All the animals have got " + sum + " legs");

    }
}