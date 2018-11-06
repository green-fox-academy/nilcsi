import java.util.ArrayList;
import java.lang.String;

public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

          // System.out.println(original);
        reverse(reversed);
        System.out.println(reverse(reversed));
    }

    public static String reverse(String reversed) {
        String original = "";
        int length = reversed.length();

        for (int i = length - 1; i >= 0; i--) {
            original = original + reversed.charAt(i);
        }
        return original;
    }
}