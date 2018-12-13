package hellobean.hellobeanworld;

import hellobean.hellobeanworld.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  @Autowired
  Printer print;

  public static void main(String[] args) {

    SpringApplication.run(HellobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    print.log("hello");
  }

}

