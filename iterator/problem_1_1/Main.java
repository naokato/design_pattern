import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);

    // append books
    bookShelf.appendBook(new Book("first one"));
    bookShelf.appendBook(new Book("second one"));
    bookShelf.appendBook(new Book("third one"));
    bookShelf.appendBook(new Book("fourth one"));

    // use iterator explicitly
    Iterator<Book> it = bookShelf.iterator();
    while (it.hasNext()) {
      Book book = it.next();
      System.out.println(book.getName());
    }
    System.out.println();

    // use for-each loop
    for (Book book: bookShelf) {
      System.out.println(book.getName());
    }
  }
}
