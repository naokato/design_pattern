package idcard;

import framework.Product;

// ConcreteProduct
public class IDCard extends Product {
  private int id;
  private String owner;

  IDCard(int id, String owner) {
    System.out.println("No." + id + "/" + owner + "のカードを作ります");
    this.id = id;
    this.owner = owner;
  }

  @Override
  public void use() {
    System.out.println(this + "を使います");
  }

  @Override
  public String toString() {
    return "[IDCard: No." + id + "/" + owner + "]";
  }
}
