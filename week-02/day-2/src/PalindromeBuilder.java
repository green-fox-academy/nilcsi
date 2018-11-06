import java.util.Scanner;

public class PalindromeBuilder {
    public static void main(String args[]) {
        createPalindrome();
    }

    public static void createPalindrome () {
        System.out.println("Please, give me a string: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        char[] in = userInput.toCharArray();
        System.out.print(userInput);

        for (int i = in.length-1;i>=0;i--) {
            System.out.print(in[i]);
        }
    }
}
