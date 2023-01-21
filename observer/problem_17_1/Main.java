public class Main {
  public static void main(String[] args) {
    NumberGenerator generator = new IncrementalNumberGenerator(1, 50, 1);
    Observer observer1 = new DigitObserver();
    Observer observer2 = new GraphObserver();
    generator.addObserver(observer1);
    generator.addObserver(observer2);
    generator.execute();
  }
}
