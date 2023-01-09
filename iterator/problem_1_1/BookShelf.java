import java.util.Iterator;
import java.util.ArrayList;

public class BookShelf implements Iterable<Book> {
  private ArrayList<Book> books;

  public BookShelf(int initialSize) {
    this.books = new ArrayList<>(initialSize);
  }

  public Book getBookAt(int index) {
    return books.get(index);
  }

  public void appendBook(Book book) {
    books.add(book);
  }

  public int getLength() {
    return books.size();
  }

  @Override
  public Iterator<Book> iterator() {
    return new BookShelfIterator(this);
  }

//  public static void main(String[] args) {
//    BookShelf bookShelf = new BookShelf();
//    System.out.println(bookShelf.getLength());
//
//    bookShelf.appendBook(new Book("naokato"));
//    System.out.println(bookShelf.getLength());
//    
//    bookShelf.appendBook(new Book("naokato2"));
//    System.out.println(bookShelf.getLength());
//    
//    bookShelf.appendBook(new Book("naokato3"));
//    System.out.println(bookShelf.getLength());
//
//    System.out.println(bookShelf.getBookAt(0).getName());
//    System.out.println(bookShelf.getBookAt(1).getName());
//    System.out.println(bookShelf.getBookAt(2).getName());
//  }
}
