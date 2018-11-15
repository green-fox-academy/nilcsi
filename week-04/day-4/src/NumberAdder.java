public class NumberAdder {

  // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

  public static void main(String[] args) {
    System.out.println(addNumber(8));
  }

  public static int addNumber(int n) {
    if (n == 0) {
      return 0;
    } else {
      return n + addNumber(n - 1);
    }
  }
}
