import java.util.List;

public class Librarian extends User {

    public Librarian(String firstName, String lastName, String ticketNumber) {
        super(firstName, lastName, ticketNumber);
    }

    public void addBook(Book book, List<Book> catalog) {
        catalog.add(book);
        System.out.println(book.getTitle() + " added to the catalog.");
    }

    public void removeBook(Book book, List<Book> catalog) {
        if (catalog.remove(book)) {
            System.out.println(book.getTitle() + " removed from the catalog.");
        } else {
            System.out.println(book.getTitle() + " not found in the catalog.");
        }
    }
}
