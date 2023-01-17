import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.FileVisitResult;
import java.io.IOException;

// class MyFileVisitor extends SimpleFileVisitor<Path> {
//   @Override
//   public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
//     System.out.println("dir:" + dir);
//     return FileVisitResult.CONTINUE;
//   }
// 
//   @Override
//   public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//     System.out.println("file:" + file);
//     return FileVisitResult.CONTINUE;
//   }
// }

public class Main {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: java Main dirname");
      System.out.println("Example: java Main .");
      System.exit(0);
    }

    String dirname = args[0];

    try {
      Files.walkFileTree(
        Path.of(dirname), 
        // Anonymous Class
        new SimpleFileVisitor<Path>() {
          @Override
          public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            System.out.println("dir:" + dir);
            return FileVisitResult.CONTINUE;
          }
 
          @Override
          public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            System.out.println("file:" + file);
            return FileVisitResult.CONTINUE;
          }
        }
      );
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
