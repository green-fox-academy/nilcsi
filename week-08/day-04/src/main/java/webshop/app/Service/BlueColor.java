package webshop.app.Service;

import org.springframework.stereotype.Service;
import webshop.app.MyColor;

@Service
public class BlueColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is blue color");
  }
}
