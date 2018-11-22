package animal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

  @Test
  public void increaseEat() {
    Animal animal = new Animal();
    animal.eat();
    assertEquals(49, animal.eat());
  }

  @Test
  public void increaseDdrink() {
    Animal animal = new Animal();
    animal.drink();
    animal.drink();
    assertEquals(48, animal.drink());
  }

  @Test
  public void play() {
    Animal animal = new Animal();
    animal.play();
    animal.play();
    assertEquals(52, animal.eat());
    assertEquals(52, animal.drink());
  }
}
