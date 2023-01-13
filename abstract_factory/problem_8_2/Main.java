import factory.*;

public class Main {
  public static void main(String[] args) {
    if (args.length != 2 ) {
      System.out.println("Usage: java Main filename.html class.name.of.ConcreteFactory");
      System.exit(0);
    }

    String filename = args[0];
    String classname = args[1];

    Factory factory = Factory.getFactory(classname);

    Page page = factory.createYahooPage();
    page.output(filename);
  }
}
