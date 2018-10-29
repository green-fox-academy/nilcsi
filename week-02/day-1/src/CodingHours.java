public class CodingHours {
    public static void main(String[] args) {

        int weekday_numbers = 7*17;
        int weekendday_numbers = 2*17;
        System.out.println(weekday_numbers);
        int allWeekday = weekday_numbers - weekendday_numbers;
        int codeTime = 6 * allWeekday;

        System.out.println("Hours spent with coding: " + codeTime);

        int allTime = 52 / weekday_numbers;

        System.out.println(allTime);

    }
}