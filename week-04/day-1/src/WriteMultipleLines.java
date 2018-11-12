import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class WriteMultipleLines {
    public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number paramter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.

        String fileName = "source\\my-new-file.txt";
        String word = "apple";
        int number = 5;

        writeFile(fileName, word, number);
    }

    public static void writeFile(String name, String theWord, int numOfLines) {
        List<String> content = new ArrayList();
        for(int i = 0; i < numOfLines; i++) {
            content.add(theWord);
        }
        Path file = Paths.get(name);
        try {
            Files.write(file, content);
        } catch (IOException e) {
            System.out.println("Crashed");
        }

    }
}