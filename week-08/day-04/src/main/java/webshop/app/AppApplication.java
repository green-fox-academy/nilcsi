package webshop.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import webshop.app.Service.BlueColor;
import webshop.app.Service.Printer;
import webshop.app.Service.UtilityService;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

  MyColor color;
  Printer print;
  UtilityService us;

  public static void main(String[] args) {
    SpringApplication.run(AppApplication.class, args);
  }

  @Autowired
  public AppApplication() {
    us = new UtilityService();
  }

  /*@Override
  public void run(String... args) throws Exception {
    print.log("hello");
  }*/

  @Override
  public void run(String... args) throws Exception {
    us.randomColor();
  }

}

