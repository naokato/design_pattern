public class Main {
  private static final int matchCount = 10000;

  public static void main(String[] args) {
    if (args.length !=2) {
      System.out.print("Usage: java Main randomseed1 randomseed2");
      System.out.print("Example: java Main 314 15");
      System.exit(0);
    }

    int seed1 = Integer.parseInt(args[0]);
    int seed2 = Integer.parseInt(args[1]);
    Player player1 = new Player("kato", new WinningStrategy(seed1));
    Player player2 = new Player("tanaka", new ProbStrategy(seed2));
    for (int i = 0; i < matchCount; i++) {
      Hand nextHand1 = player1.nextHand();
      Hand nextHand2 = player2.nextHand();
      if (nextHand1.isStrongerThan(nextHand2)) {
        player1.win();
        player2.lose();
        System.out.println("Winner:" + player1);
      } else if (nextHand2.isStrongerThan(nextHand1)) {
        player1.lose();
        player2.win();
        System.out.println("Winner:" + player2);
      } else {
        player1.even();
        player2.even();
        System.out.println("Even...");
      }
    }
    System.out.println("Total result:");
    System.out.println(player1);
    System.out.println(player2);
  }
}
