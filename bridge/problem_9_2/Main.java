public class Main {
  public static void main(String[] args) {
    Display d1 = new Display(new FileDisplayImpl("test.json"));

    d1.display();
  }
}
