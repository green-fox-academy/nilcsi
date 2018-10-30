import java.util.Scanner;

public class AvarageOfInput {

    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        System.out.println("Please, hive me a number: ");

        int number1;
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();

        System.out.println("Please, give me a number: ");

        int number2;
        Scanner scanner2 = new Scanner(System.in);
        number2 = scanner2.nextInt();

        System.out.println("Please, give me a number: ");

        int number3;
        Scanner scanner3 = new Scanner(System.in);
        number3 = scanner3.nextInt();

        System.out.println("Please, give me a number: ");

        int number4;
        Scanner scanner4 = new Scanner(System.in);
        number4 = scanner4.nextInt();

        System.out.println("Please, give me a number: ");

        int number5;
        Scanner scanner5 = new Scanner(System.in);
        number5 = scanner5.nextInt();

        int sum = number1 + number2 + number3 + number4 + number5;
        System.out.println("Sum: " + sum);

        int avr = (number1 + number2 + number3 + number4 + number5)/5;
        System.out.println("Avarage: " + avr);

        /* for (int i = 0; i < 5; i++) {
            System.out.println("Please, write a number: ");

            int number;
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();



            System.out.println(sum);
        }



            int avarage = 0;
            avarage = sum / i;*/
    }
}