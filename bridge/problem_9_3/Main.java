public class Main {
  public static void main(String[] args) {
    // IncrementalDisplay d1 = new IncrementalDisplay(new CharDisplayImpl('<', '*', '>'), 3);
    // IncrementalDisplay d1 = new IncrementalDisplay(new CharDisplayImpl('|', '#', '-'), 3);
    IncrementalDisplay d1 = new IncrementalDisplay(new StringDisplayImpl("Hello, World!"), 1);
    d1.incrementalDisplay(3);
  }
}
