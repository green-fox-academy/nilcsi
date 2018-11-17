import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        System.out.println("Please, give me two numbers: ");
        System.out.println("The first one is: ");
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        System.out.println("And the second one is: ");
        int b;
        b = scanner.nextInt();

        if(b < a){

            System.out.println("The second number should be bigger");
        }else {
            System.out.println("Count from " + a + " to " + b + ": ");
            for(int i = a; i < b; i++)
            {
                System.out.println(i + " ");
            }
        }

    }
}
