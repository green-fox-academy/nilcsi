public class String3 {

  // Given a string, compute recursively a new string where all the
  // adjacent chars are now separated by a "*".

  public static void main(String[] args) {
    System.out.println(Star("kndvnlkj"));
  }

  public static String Star(String text) {
    if(text.length() == 1) {
      return text;
    } else {
      String subString = text.substring(1);
      return text.substring(0,1) + "*" + Star(subString);
    }
  }
}
