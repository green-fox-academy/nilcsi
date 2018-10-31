public class CodingHours {
    public static void main(String[] args) {

        int semesterDays = 5 * 17;
        int codingTime = 6 * semesterDays;
        float weeklyHours = 5*24;
        float allTime = (52 / weeklyHours) * 100;

        System.out.println("Hours spent with coding: " + codingTime);
        System.out.println("Percentage of coding hours: " + allTime + "%");
    }
}