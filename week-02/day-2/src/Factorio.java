import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorio {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial

    public static void main(String args[]) {
        System.out.println("Please, give me a number: ");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        factorio(number);
    }

    public static int factorio(int number) {
        int fakt = 1;
        int i;
        for (i = 1; i < number; ++i) {
            fakt = fakt * i;
        }
        System.out.println(i + "! = " + fakt);
        return number;
    }

}