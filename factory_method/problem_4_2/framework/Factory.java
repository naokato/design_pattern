package framework;

// Creator
public abstract class Factory {
  // TemplateMethod
  public final Product create(String owner) {
    Product p = createProduct(owner);
    registerProduct(p);
    return p;
  }

  // factoryMethod
  protected abstract Product createProduct(String owner);
  protected abstract void registerProduct(Product product);
}
