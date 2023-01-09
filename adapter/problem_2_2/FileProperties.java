import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

// Adapter
public class FileProperties implements FileIO {
  private Properties properties;

  public FileProperties() {
    this.properties = new Properties();
  }

  @Override
  public void readFromFile(String filename) throws IOException {
    Reader reader = new FileReader(filename);
    properties.load(reader);
  }

  @Override
  public void writeToFile(String filename) throws IOException {
    Writer writer = new FileWriter(filename);
    properties.store(writer, null);
  }

  @Override
  public void setValue(String key, String value) {
    properties.setProperty(key, value);
  }

  @Override
  public String getValue(String key) {
    return properties.getProperty(key);
  }
}
