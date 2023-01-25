public class Main {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Usage: java Main digits");
      System.out.println("Example: java Main 12121212");
      System.exit(0);
    }

    BigString bs1 = new BigString(args[0], true);
    bs1.print();

    System.out.println("-----------------------------------------------");
    
    BigString bs2 = new BigString(args[0]);
    bs2.print();
    
    System.out.println("-----------------------------------------------");
    
    BigString bs3 = new BigString(args[0], false);
    bs3.print();
  }
}
