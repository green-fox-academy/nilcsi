package bankofsimba.controller;

import bankofsimba.model.BankAccount;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController implements Serializable {

  public List<BankAccount> accounts = new ArrayList();
  List<BankAccount> listOfAccounts;

  public AccountController() {
    accounts.add(new BankAccount("Simba", 2000, "lion", true, "good"));
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showAccounts(Model model) {
    model.addAttribute("accounts", accounts);
    return "index";
  }

  @RequestMapping(path = "/showtext", method = RequestMethod.GET)
  public String displayString(Model model, String text) {
    text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "text";
  }

  @RequestMapping(path = "/accounts", method = RequestMethod.GET)
  public String multipleAccounts(Model model) {
    listOfAccounts = new ArrayList<>();
    listOfAccounts.add(new BankAccount("Simba", 542.32, "lion", true, "good"));
    listOfAccounts.add(new BankAccount("Pumbaa", 4352.43, "agdag", false, "good"));
    listOfAccounts.add(new BankAccount("Zazu", 144.3, "fgnjdf", false, "good"));
    listOfAccounts.add(new BankAccount("Rafiki", 82.45, "gfncghkm", false, "bad"));
    model.addAttribute("list", listOfAccounts);
    return "accounts";
  }

  @PostMapping(value="/addAccount")
  public String addAccount(String name, double balance, String animalType, boolean isKing, String goodBad) {
    BankAccount newAccount = new BankAccount(name, balance, animalType, isKing, goodBad);
    this.listOfAccounts.add(newAccount);
    return "redirect:/";
  };
}
