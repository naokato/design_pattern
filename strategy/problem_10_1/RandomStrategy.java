import java.util.Random;

public class RandomStrategy implements Strategy {
  private Random random;

  public RandomStrategy(int seed) {
    random = new Random(seed);
  }

  @Override
  public Hand nextHand() {
    return Hand.getHand(random.nextInt(3));
  }

  @Override
  public void study(boolean win) {
    return;
  }

  //public static void main(String[] args) {
  //  RandomStrategy strategy = new RandomStrategy(10);
  //  for (int i = 0; i < 1000; i++) {
  //    System.out.println(strategy.nextHand());
  //    strategy.study(true);
  //  }
  //}
}
