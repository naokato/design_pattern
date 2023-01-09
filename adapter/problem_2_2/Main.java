import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      FileIO f = new FileProperties();

      f.readFromFile("./file.txt");
      System.out.println(f.getValue("width"));

      f.setValue("name", "naokato");
      f.setValue("width", "1024");
      f.writeToFile("./newfile.txt");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
