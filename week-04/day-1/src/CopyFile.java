import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        Path fileName = Paths.get("source\\fileName.txt");
        Path otherFile = Paths.get("source\\otherFile.txt");

        System.out.println(copyFiles(fileName, otherFile));
    }

    public static boolean copyFiles(Path file1, Path file2){
        boolean isSuccessful = false;

        try {
            List<String> fileContent = Files.readAllLines(file1);
            Files.write(file2, fileContent);
            isSuccessful = true;

        } catch (IOException e) {
        }
        return isSuccessful;
    }
}