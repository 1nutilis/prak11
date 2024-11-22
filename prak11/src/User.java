public abstract class User {
    protected String firstName;
    protected String lastName;
    protected String ticketNumber;

    public User(String firstName, String lastName, String ticketNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketNumber = ticketNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }
}