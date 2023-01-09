import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    Shop shop = new Shop();
    shop.addItem(new Item("food1"))
      .addItem(new Item("food2"))
      .addItem(new Item("food3"))
      .addItem(new Item("book1"))
      .addItem(new Item("book2"));

    Iterator<Item> it = shop.iterator();
    while (it.hasNext()) {
      System.out.println(it.next().getName());
    }
      
    System.out.println();

    for (Item item : shop) {
      System.out.println(item.getName());
    }
  }
}
