public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;

    // make the "a" variable's value bigger by 10
    a = a + 10;

    System.out.println("a = " + a);

    int b = 100;
    // make b smaller by 7
    b = b - 7;
    System.out.println("b = " + b);

    int c = 44;
    // please double c's value
    c = c * 2;

    System.out.println("c = " + c);

    int d = 125;
    // please divide by 5 d's value
    d = d / 5;
    System.out.println("d = " + d);

    int e = 8;
    // please cube of e's value
    e = e * e;
    System.out.println("e = " + e);

    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)

    if (f1 > f2) {
      System.out.println("f = " + true);
    } else {
      System.out.println("f = " + false);
    }

    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)

    if (g2 * 2 > g1) {
      System.out.println("g = " + true);
    } else {
      System.out.println("g = " + false);
    }

    int h = 135798745;

    // tell if it has 11 as a divisor (print as a boolean)

    if (h % 11 == 0) {
      System.out.println("h = " + true);
    } else {
      System.out.println("h = " + false);
    }

    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    if (i1 > (i2 * i2) && i1 < (i2 * i2 * i2)) {
      System.out.println("i = " + true);
    } else {
      System.out.println("i = " + false);
    }
    int j = 1521;
    int three = j % 3;
    int five = j % 5;
    // tell if j is dividable by 3 or 5 (print as a boolean)
    if (three == 0 || five == 0) {
      System.out.println("j = " + true);
    } else {
      System.out.println("j = " + false);
    }

    String k = "Apple";
    //fill the k variable with its content 4 times
    for (int i = 0; i < 4; i++) {
      System.out.println("k = " + k);
    }
  }
}
