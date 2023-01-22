package game;

import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Memento
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

  public static boolean saveToFile(String filename, Memento memento) {
    try {
      Writer writer = new FileWriter(filename);
      writer.write(String.valueOf(memento.getMoney()) + "\n");
      for (String fruit: memento.getFruits()) {
        writer.write(fruit + "\n");
      }
      writer.close();
    } catch (IOException e) {
      return false;
    }

    return true;
  }

  public static Memento loadFromFile(String filename) {
    try {
      List<String> strMemento = Files.readAllLines(Path.of(filename));
      if (strMemento.size() == 0) {
        System.out.println("セーブデータが空です");
        return null;
      }

      int money = 0;
      try {
        money = Integer.parseInt(strMemento.get(0));
      } catch (NumberFormatException e) {
        System.out.println("セーブデータ保存された money のフォーマットが不正です");
        return null;
      }

      Memento memento = new Memento(money);

      // remove first line which means money
      strMemento.remove(0);
      for (String fruit: strMemento) {
        memento.addFruit(fruit);
      }

      return memento; 
    } catch (IOException e) {
      System.out.println(e.toString());
      return null;
    }
  }

  public static void main(String[] args) {
    // Memento memento = new Memento(100);
    // memento.addFruit("ばなな");
    // memento.addFruit("りんご");
    // Memento.saveToFile("./test.txt", memento);

    // Memento memento = Memento.loadFromFile("./test.txt");
    // System.out.println(memento.getMoney());
    // System.out.println(memento.getFruits());
  }
}
