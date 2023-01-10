package idcard;

import framework.Factory;
import framework.Product;

// ConcreteCreator
public class IDCardFactory extends Factory {
  private int currentNumber = 1;

  @Override
  protected synchronized Product createProduct(String owner) {
    return new IDCard(currentNumber++, owner); 
  }

  @Override
  protected void registerProduct(Product product) {
    System.out.println(product + "を登録しました");
  }
}
