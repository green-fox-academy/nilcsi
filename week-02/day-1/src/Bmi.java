public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        double height2 = heightInM * heightInM;

        double bmi = massInKg / height2;

        System.out.println(bmi);
    }
}