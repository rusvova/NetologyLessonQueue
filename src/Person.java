public class Person {
    protected String name;
    protected String surname;
    protected int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public void spendTicket() {
        tickets--;
    }

    public boolean hasMoreTicket() {
        return tickets > 0;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTickets() {
        return tickets;
    }
}
