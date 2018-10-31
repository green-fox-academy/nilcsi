public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int dailyHours = 24;
        int minutes = dailyHours*60;
        int dailySeconds = minutes *60;

        int current = 42 + (34*60) + (14*60)*60;

        int remaining = dailySeconds - current;

        System.out.println(remaining);
    }
}