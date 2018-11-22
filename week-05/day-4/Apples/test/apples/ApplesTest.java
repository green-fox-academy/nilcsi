package apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppesTest {

  @Test
  void TestMethod() {
    Apples apple = new Apples();
    assertEquals("apple", apple.getApple());
  }
}
