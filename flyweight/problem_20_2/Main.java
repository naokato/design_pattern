public class Main {
  public static void main(String[] args) {
    String string = "1".repeat(100000);
    //BigString bs1 = new BigString(string, true);
    
    BigString bs2 = new BigString(string, false);

    Runtime.getRuntime().gc();
    long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    System.out.println("使用メモリ = " + used);
  }
}
