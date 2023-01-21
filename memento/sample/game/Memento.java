package game;

import java.util.ArrayList;
import java.util.List;

/ Memento
public class Memento {
  private int money;
  private List<String> fruits;

  // narrow interface
  public int getMoney() {
    return money;
  }

  // wide interface
  Memento(int money) {
    this.money = money;
    this.fruits = new ArrayList<>();
  }

  // wide interface
  void addFruit(String fruit) {
    fruits.add(fruit);
  }

  // wide interface
  List<String> getFruits() {
    return new ArrayList<>(fruits);
  }
}
