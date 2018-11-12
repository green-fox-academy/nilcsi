import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Doubled {

    public static void main(String[] args) throws IOException {
        // Create a method that decrypts the duplicated-chars.txt

        ArrayList<String> normalText = new ArrayList<>();

        Path inputFile = Paths.get("source/duplicated-chars.txt");
        Files.readAllLines(inputFile);

        for(int i = 0; i < inputFile.size(); i++) {
            if(!normalText.contains(normalText.get(i))) {
                normalText.add(normalText.get(i));
            }
        }

    }
}