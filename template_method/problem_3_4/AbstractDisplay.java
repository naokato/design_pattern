public interface AbstractDisplay {
  public abstract void open();
  public abstract void print();
  public abstract void close();

  // Template Method
  public default void display() {
    open();
    for (int i = 0; i < 5; i++) {
      print();
    }
    close();
  }
}
