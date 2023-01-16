import java.util.ArrayList;
import java.util.List;

// Composite
public class Directory extends Entry {
  private String name;
  private List<Entry> directory = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    // int size = 0;
    // for (Entry entry: directory) {
    //   size += entry.getSize();
    // }
    // return size;
    
    return directory.stream().mapToInt(entry -> entry.getSize()).sum();
  }

  @Override
  protected void printList(String prefix) {
    // display name following size
    System.out.println(prefix + "/" + this);
    for (Entry entry: directory) {
      // path name only (without size)
      entry.printList(prefix + "/" + name);
    }
  }

  // public Entry add(Entry entry) {
  // enable method chain by using Directory as return type
  public Directory add(Entry entry) {
    directory.add(entry);
    entry.setParent(this);
    return this;
  }
}
