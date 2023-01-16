// Component
public abstract class Entry {
  protected Entry parent;

  public abstract String getName();
  
  public abstract int getSize();
  
  public void setParent(Entry parent) {
    this.parent = parent;
  }
  
  public String getFullPath() {
    StringBuilder sb = new StringBuilder();
    Entry entry = this;
    do {
      sb.insert(0, entry.getName());
      sb.insert(0, "/");
      entry = entry.parent;
    } while (entry != null);
    return sb.toString();
  }

  public void printList() {
    printList("");
  }

  protected abstract void printList(String prefix);

  @Override
  public String toString() {
    return getName() + " (" + getSize() + ")";
  }
}
