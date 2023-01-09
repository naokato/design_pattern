import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
  private Book[] books;
  private int last = 0;

  public BookShelf(int maxsize) {
    this.books = new Book[maxsize];
  }

  public Book getBookAt(int index) {
    return books[index];
  }

  public void appendBook(Book book) {
    this.books[last] = book;
    last++;
  }

  public int getLength() {
    return last;
  }

  @Override
  public Iterator<Book> iterator() {
    return new BookShelfIterator(this);
  }

//  public static void main(String[] args) {
//    BookShelf bookShelf = new BookShelf(2);
//    System.out.println(bookShelf.getLength());
//
//    bookShelf.appendBook(new Book("naokato"));
//    System.out.println(bookShelf.getLength());
//    
//    bookShelf.appendBook(new Book("naokato2"));
//    System.out.println(bookShelf.getLength());
//    
//    System.out.println(bookShelf.getBookAt(0).getName());
//    System.out.println(bookShelf.getBookAt(1).getName());
//  }
}
