package bankofsimba.model;

import java.text.DecimalFormat;

public class BankAccount {

  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private String goodBad;

  public BankAccount(String name, double balance, String animalType, boolean isKing, String goodBad) {
    this.name = name;
    this.balance = this.getBalance();
    this.animalType = animalType;
    this.isKing = isKing;
    this.goodBad = goodBad;
  }

  public String getName() {
    return name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public double getBalance() {
    return balance;
  }

  public boolean getIsKing() {
    return isKing;
  }

  public String getGoodBad() {
    return goodBad;
  }
}
