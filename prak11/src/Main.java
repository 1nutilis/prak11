import java.util.List;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("SIGMA", "Expert in programming.");
        Author author2 = new Author("SKIBIDI", "Specialist in design patterns.");


        Book book1 = new Book("Java Programming", author1, "Programming", "12345");
        Book book2 = new Book("Design Patterns", author2, "Software Engineering", "67890");


        Catalog catalog = new Catalog();
        catalog.addBook(book1);
        catalog.addBook(book2);


        Reader reader = new Reader("sigma", "sigmovich", "R001");
        Librarian librarian = new Librarian("skibidi", "skibidovich", "L001");


        librarian.addBook(book1, catalog.books);


        reader.borrowBook(book1);


        Report.generateBookReport(catalog);
        Report.generateReaderActivityReport(List.of(reader));


        reader.returnBook(book1);


        Report.generateBookReport(catalog);
    }
}