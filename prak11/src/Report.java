import java.util.List;

public class Report {
    public static void generateBookReport(Catalog catalog) {
        System.out.println("Book Report:");
        catalog.displayAllBooks();
    }

    public static void generateReaderActivityReport(List<Reader> readers) {
        System.out.println("Reader Activity Report:");
        for (Reader reader : readers) {
            System.out.println(reader.getFullName() + " borrowed books:");
            for (Book book : reader.getBorrowedBooks()) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
}
