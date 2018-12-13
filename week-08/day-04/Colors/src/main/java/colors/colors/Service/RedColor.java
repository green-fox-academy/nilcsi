package colors.colors.Service;

import colors.colors.MyColor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class RedColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is red color");
  }
}
