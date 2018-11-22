package count.letters;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

  @Test
  public void countLetters() {
    String text = "baba";
    HashMap myHas = new HashMap<Integer, String>();
    myHas.put("a", 2);
    myHas.put("b", 2);
    assertEquals(myHas, CountLetters.countLetters(text));
  }
}
