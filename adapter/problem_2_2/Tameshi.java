import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Tameshi {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    Reader reader = new FileReader("./file.txt");

    // Test BufferedReader
    // BufferedReader bufferedReader = new BufferedReader(reader); 
    // String data = bufferedReader.readLine();
    // System.out.println(data);

    // Test basic Reader.reader method
    // int firstChar = reader.read();
    // System.out.println((char)firstChar);

    Properties properties = new Properties();
    properties.load(reader);
    properties.list(System.out);
    
    properties.setProperty("name", "naokato");
    properties.list(System.out);
    
    Writer writer = new FileWriter("./newfile.txt");
    properties.store(writer, "test comment");
  }
}
