import java.lang.reflect.Array;
import java.util.*;

public class MatchMaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        for(int i = 0; i < girls.size(); i++) {
            System.out.print(girls.get(i) + " ");
            for (int j = 0; j < boys.size() + 1; j++) {
                System.out.print(boys.get(i) + " ");
            }
        }


        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        //  System.out.println(makingMatches(girls, boys));
    }

  /*  public static String makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
         for(int i = 0; i < girls.size(); i++) {
             System.out.println(girls.get(i));
             for (int j = 0; j < boys.size(); j++) {
                 System.out.println(boys.get(i));
             }

         }
         return ;
    }*/
}