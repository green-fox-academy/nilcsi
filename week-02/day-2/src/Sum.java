public class Sum {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer
    public static void main(String[] args) {

        int param = 10;
        sum(param);
    }

    public static int sum(int param) {

        int[] allNumbers = new int [param];
        int summation = 0;
        for(int i = 0; i < param; i++) {
            allNumbers[i] = i;
            summation += i;
        }
        System.out.println(summation);

        return summation;
    }
}
