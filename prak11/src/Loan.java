import java.util.Date;

public class Loan {
    private Book book;
    private Reader reader;
    private Date loanDate;
    private Date returnDate;

    public Loan(Book book, Reader reader, Date loanDate) {
        this.book = book;
        this.reader = reader;
        this.loanDate = loanDate;
    }

    public Book getBook() {
        return book;
    }

    public Reader getReader() {
        return reader;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void completeLoan(Date returnDate) {
        this.returnDate = returnDate;
        book.markAsAvailable();
        System.out.println("Loan completed for " + book.getTitle() + " by " + reader.getFullName());
    }
}
