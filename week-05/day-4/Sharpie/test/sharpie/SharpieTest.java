package sharpie;

import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

  @Test
  public void decreaseInkAmount() {
    Sharpie sharpie = new Sharpie("blue", 10);
    int result = 97;

    sharpie.use();
    assertEquals(result, sharpie.inkAmount, 5);
  }
}
