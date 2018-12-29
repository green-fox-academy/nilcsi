package com.bankofsimba.controller;

import com.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {

  private List<BankAccount> accounts = new ArrayList<>();

  public AccountController() {
    accounts.add(new BankAccount("Simba", 2000, "lion", true, true));
    accounts.add(new BankAccount("Timon", 100, "meerkat", false, true));
    accounts.add(new BankAccount("Zazu", 4024, "hornbill", false, true));
    accounts.add(new BankAccount("Banzai", 3462, "hyena", false, false));
    accounts.add(new BankAccount("Mufasa", 135, "lion", false, false));
  }

  @GetMapping("/show")
  public String index(Model model) {
    model.addAttribute("accounts", accounts);
    return "index";
  }

  @GetMapping("/html")
  public String htmlception(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "htmlception";
  }

  @GetMapping("/newaccount")
  public String newAccountForm(Model model) {
    model.addAttribute("bankaccount", new BankAccount());
    return "add-account";
  }

  @PostMapping("/newaccount")
  public String addNewAccount(@ModelAttribute BankAccount bankAccount) {
    accounts.add(bankAccount);
    return "redirect:/show";
  }

  @PostMapping("/balance")
  public String raiseBalance(@ModelAttribute(name = "name") String accountName) {
    for(BankAccount account : accounts) {
      if(accountName.equals(account.getName())) {
        account.topUp();
      }
    }
    return "redirect:/show";
  }
}
