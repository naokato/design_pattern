import framework.Product;

public class UnderlinePen implements Product {
  private char ulchar;

  public UnderlinePen(char ulchar) {
    this.ulchar = ulchar;
  }

  @Override
  public void use(String s) {
    int ulen = s.length();
    System.out.println(s);
    for (int i = 0; i < ulen; i++) {
      System.out.print(ulchar);
    }
    System.out.println();
  }

  @Override
  public Product createCopy() {
    Product p = null;
    try {
      p = (Product)clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return p;
  }

  public static void main(String[] args) {
    Product box = new UnderlinePen('_');
    box.use("naokato");
    System.out.println();

    Product copiedBox = box.createCopy();
    copiedBox.use("copied");
    System.out.println();

    System.out.println(box);
    System.out.println(copiedBox);
  }
}
