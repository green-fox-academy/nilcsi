public class String2 {
  // Given a string, compute recursively a new string where all the 'x' chars have been removed.

  public static void main(String[] args) {
    System.out.println(deleteX("Txoxdxaxyx"));
  }

  public static String deleteX(String text){
    if(!text.contains("x")) {
      return text;
    } else {
      return deleteX(text.replace("x", ""));
    }
  }
}
