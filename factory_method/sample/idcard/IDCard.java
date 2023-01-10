package idcard;

import framework.Product;

// ConcreteProduct
public class IDCard extends Product {
  private String owner;

  IDCard(String owner) {
    System.out.println(owner + "のカードを作ります");
    this.owner = owner;
  }

  @Override
  public void use() {
    System.out.println(this + "を使います");
  }

  @Override
  public String toString() {
    return "[IDCard:" + owner + "]";
  }

//  public static void main(String [] args) {
//    IDCard idcard = new IDCard("naokato");
//    idcard.use();
//  }
}
