package anagram;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram a;

  @Before
  public void before() {
    a = new Anagram();
  }

  @Test
  public void testIsAnagramMethodFalse() {
    assertFalse(a.isAnagram("ugugugu", "ugugug"));
  }

  @Test
  public void testIsAnagramMethodTrue() {
    assertTrue(a.isAnagram("funeral", "realfun"));
  }

}
