package webshop;

import java.util.ArrayList;
import java.util.List;

public class Stock {

  List<ShopItem> items;

  public Stock() {
    items = new ArrayList<>();
    items.add(new ShopItem("Running shoes", "Nike running shoes for everyday sport", 1000.0, 5));
    items.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
    items.add(new ShopItem("Coca Cola", "0.5l standard coke", 25.0, 0));
    items.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
    items.add(new ShopItem("T-shirt", "Blue with a corgi on bike", 300.0, 1));
  }
}
