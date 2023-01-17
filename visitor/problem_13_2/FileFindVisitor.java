import java.util.ArrayList;
import java.util.List;

public class FileFindVisitor extends Visitor {
  private String extension;
  private List<File> foundFiles = new ArrayList<>();
  
  public FileFindVisitor(String extension) {
    this.extension = extension;
  }

  @Override
  public void visit(File file) {
    if (file.getName().endsWith(extension)) {
      foundFiles.add(file);
    }
  }

  @Override
  public void visit(Directory directory) {
    for (Entry entry: directory) {
      entry.accept(this);
    }
  }

  // Iterable 型にする事で、iterate 以外の用途で使わせない
  public Iterable<File> getFoundFiles() {
    return foundFiles;
  }
}
