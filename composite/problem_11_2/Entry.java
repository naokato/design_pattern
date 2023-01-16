// Component
public abstract class Entry {
  protected String parrentPath = "";

  public abstract String getName();
  
  public abstract int getSize();
  
  public void setParrentPath(String parrentPath) {
    this.parrentPath = parrentPath;
  }
  
  public String getFullPath() {
    return parrentPath + "/" + getName();
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
