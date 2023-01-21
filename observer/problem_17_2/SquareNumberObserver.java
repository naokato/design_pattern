public class SquareNumberObserver implements Observer {
  @Override
  public void update(NumberGenerator generator) {
    System.out.println("SquareNumberObserver:" + (int) Math.pow(generator.getNumber(), 2));
  }
}
