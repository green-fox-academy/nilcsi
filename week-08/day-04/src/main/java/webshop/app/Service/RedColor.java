package webshop.app.Service;

import org.springframework.stereotype.Service;
import webshop.app.MyColor;

@Service
public class RedColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is red color");
  }
}
