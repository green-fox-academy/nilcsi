package webshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@SpringBootApplication
@Controller
public class WebshopApplication {
  Stock stock;

  public WebshopApplication() {
    stock = new Stock();
  }

  public static void main(String[] args) {
    SpringApplication.run(WebshopApplication.class, args);
  }

  @RequestMapping("/")
  public String webshop(Model model) {
    model.addAttribute("items", stock.items);
    return "webshop";
  }

  @RequestMapping("/only-available")
  public
}
