public class Refactorio {

  // Create a recursive function called `refactorio`
  // that returns it's input's factorial

  public static void main(String[] args) {
    System.out.println(fact(3));
  }

  public static int fact(int num) {
    if(num == 1) {
      return 1;
    } else {
      return num * fact(num - 1);
    }
  }
}
