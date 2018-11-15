import java.lang.String;

public class Strings {
  // Given a string, compute recursively (no loops) a new string where all the
  // lowercase 'x' chars have been changed to 'y' chars.

  public static void main(String[] args) {
    System.out.println(xToy("xxxYYY"));
  }

  public static String xToy(String xY) {
    if(!xY.contains("x")) {
        return xY;
    } else {
        return xY.replace("x", "y");
    }
  }
}
