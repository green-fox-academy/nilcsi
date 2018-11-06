import java.lang.reflect.Array;
import java.util.*;

public class MatchMaking{
   public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> girlsNames, ArrayList<String> boysNames) {
       ArrayList<String> allNames = new ArrayList<>();
        for (int i = 0; i < girlsNames.size() && i < boysNames.size() ; i++) {
            allNames.add(girlsNames.get(i) + ", " + boysNames.get(i));
        }

        return allNames;
   }
}