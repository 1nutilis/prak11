import java.util.ArrayList;
import java.util.List;

public class Catalog {
    List<Book> books;

    public Catalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + book.getTitle() + " by " + book.getAuthor().getName());
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void filterByGenre(String genre) {
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor().getName());
            }
        }
    }

    public void displayAllBooks() {
        for (Book book : books) {
            String availability = book.isAvailable() ? "Available" : "Loaned";
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor().getName() + " (" + availability + ")");
        }
    }
}
