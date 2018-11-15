public class SumDigit {

  // Given a non-negative int n, return the sum of its digits recursively (no loops).
  // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
  // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

  public static void main(String[] args) {

    int number = 26;
    System.out.println(sumDigit(number));

  }

  public static int sumDigit(int n) {
    if(n < 10) {
      return n % 10;
    } else {
      return n % 10 + sumDigit(n / 10);
    }
  }
}
