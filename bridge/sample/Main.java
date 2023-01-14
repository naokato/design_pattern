public class Main {
  public static void main(String[] args) {
    Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
    Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
    CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

    d1.display();
    System.out.println();

    d2.display();
    System.out.println();
    // d2 は Display 型なので、multiDisplay は呼び出せない
    // d2.multiDisplay(3);

    d3.display();
    System.out.println();

    d3.multiDisplay(3);
  }
}
