public class Singleton {
  private static Singleton singleton = new Singleton();

  private Singleton() {
    System.out.println("Singleton インスタンスを作成しました");
  }

  public static Singleton getInstance() {
    return singleton;
  }
}
