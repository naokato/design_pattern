public class Main {
  public static void main(String[] args) {
    AbstractDisplay d1 = new CharDisplay('N');
    d1.display();
    
    AbstractDisplay d2 = new StringDisplay("hello, world!!");
    d2.display();
  }
}
