import java.util.Iterator;
import java.util.ArrayList;

public class Shop implements Iterable<Item> {
  private ArrayList<Item> items;

  public Shop() {
    this.items = new ArrayList<>();
  }

  public Item getItemAt(int index) {
    return items.get(index);
  }
  
  public Shop addItem(Item item) {
    items.add(item);
    return this;
  }

  public int getLength() {
    return items.size();
  }

  public Iterator<Item> iterator() {
    return new ShopIterator(this);
  }

//  public static void main(String[] args) {
//    Shop shop = new Shop();
//    shop.addItem(new Item("food1"));
//    shop.addItem(new Item("food2"));
//
//    System.out.println(shop.getItemAt(0).getName());
//    System.out.println(shop.getItemAt(1).getName());
//  }
}
