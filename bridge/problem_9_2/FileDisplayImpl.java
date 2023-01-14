import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

// ConcreteImplementor
public class FileDisplayImpl extends DisplayImpl {
  private String filename;

  public FileDisplayImpl(String filename) {
    this.filename = filename;
  }

  @Override
  public void rawOpen() {
    printLine(); 
  }

  @Override
  public void rawPrint() {
    try {
      List<String> lines = Files.readAllLines(Path.of(filename));
      for (String line: lines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("ファイル読み込みエラー");
      e.printStackTrace();
    }
  }

  @Override
  public void rawClose() {
    printLine(); 
  }
  
  private void printLine() {
    System.out.print("---------- " + filename + " ---------\n");
  }
}
