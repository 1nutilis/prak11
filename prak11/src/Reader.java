import java.util.ArrayList;
import java.util.List;

public class Reader extends User {
    private List<Book> borrowedBooks;

    public Reader(String firstName, String lastName, String ticketNumber) {
        super(firstName, lastName, ticketNumber);
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.markAsLoaned();
            System.out.println(getFullName() + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.markAsAvailable();
            System.out.println(getFullName() + " returned " + book.getTitle());
        } else {
            System.out.println("Book not found in borrowed list.");
        }
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
