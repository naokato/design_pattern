import framework.Product;

// ConcretePrototype
public class MessageBox implements Product {
  private char decochar;

  public MessageBox(char decochar) {
    this.decochar = decochar;
  }
  
  // Copy Constructor
  public MessageBox(MessageBox prototype) {
    this.decochar = prototype.decochar;
  }

  @Override
  public void use(String s) {
    int decolen = 1 + s.length() + 1;
    for (int i = 0; i < decolen; i++) {
      System.out.print(decochar);
    }
    System.out.println();
    System.out.println(decochar + s + decochar);
    for (int i = 0; i < decolen; i++) {
      System.out.print(decochar);
    }
    System.out.println();
  }

  @Override
  public Product createCopy() {
    return new MessageBox(this);
  }

  public static void main(String[] args) {
    Product box = new MessageBox('*');
    box.use("naokato");
    System.out.println();

    Product copiedBox = box.createCopy();
    copiedBox.use("copied");
    System.out.println();

    System.out.println(box);
    System.out.println(copiedBox);
  }
}
