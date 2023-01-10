import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("naokato1");
    Product card2 = factory.create("naokato2");
    Product card3 = factory.create("naokato3");
    card1.use();
    card2.use();
    card3.use();
  }
}
