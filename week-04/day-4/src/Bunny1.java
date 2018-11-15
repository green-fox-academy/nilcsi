public class Bunny1 {
  // We have a number of bunnies and each bunny has two big floppy ears.
  // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

  public static void main(String[] args) {
    System.out.println(bunnyEars(4));
  }

  public static int bunnyEars(int number) {
    if(number == 1) {
      return 2;
    } else {
      return 2 + bunnyEars(number - 1);
    }
  }
}
