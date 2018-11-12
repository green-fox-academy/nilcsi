import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

    public static void main(String[] args){
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.
        Path filePath = Paths.get("source/log.txt");

        uniqueArray(filePath);
        requestRatio(filePath);
    }

    public static void uniqueArray (Path newPath) {
        ArrayList<String> content = new ArrayList<>();
        try {
            List<String> logs = Files.readAllLines(newPath);

            for (int i = 0; i < logs.size(); i++) {
                content.add(logs.get(i).substring(27, 38));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> uniqueIP = new ArrayList<>();
        for(int i = 0; i < content.size(); i++) {
            if(!uniqueIP.contains(content.get(i))) {
                uniqueIP.add(content.get(i));
            }
        }
        System.out.println(uniqueIP);
    }

    public static double requestRatio (Path newPath) {
        double postNum = 0.0;
        double getNum = 0.0;

        try {
            List<String> tempContent = Files.readAllLines(newPath);
            for (int i = 0; i < tempContent.size(); i++) {
                if (tempContent.get(i).endsWith("GET /")) {
                        getNum++;
                    } else if (tempContent.get(i).endsWith("POST /")) {
                        postNum++;
                    }
                }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double ratio = (getNum*100) / (getNum+postNum);
        System.out.println("Ratio: " + ratio);
        return ratio;
    }
}