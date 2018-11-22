package sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sum.Sum;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

  Sum list;

  @BeforeEach
  public void before() {
    list = new Sum();
  }

  @Test
  public void emptyList() {
//    Numbers list = new Numbers();
    assertEquals(0, list.sumOfElements());
  }

  @Test
  public void oneElement() {
//    Numbers list = new Numbers();
    list.listOfNumbers.add(1);
    assertEquals(1, list.sumOfElements());
  }

  @Test
  public void multipleElement() {
//    Numbers list = new Numbers();
    for (int i = 0; i < 7; i++) {
      list.listOfNumbers.add(1);
    }
    assertEquals(7, list.sumOfElements());
  }
}
