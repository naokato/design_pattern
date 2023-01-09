import java.util.Iterator;
import java.util.NoSuchElementException;

public class ShopIterator implements Iterator<Item> {
  private Shop shop;
  private int index;

  public ShopIterator(Shop shop) {
    this.shop = shop;
    index = 0;
  }

  @Override
  public boolean hasNext() {
    if (index < shop.getLength()) {
      return true;
    }

    return false;
  }

  @Override
  public Item next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    Item item = shop.getItemAt(index);
    index++;
    return item;
  }
}
