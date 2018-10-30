import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        System.out.println("Please, give me two numbers: ");
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        int b;
        b = scanner.nextInt();

        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
