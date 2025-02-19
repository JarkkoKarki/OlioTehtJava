package Tickets;

public class Customer {
    private int tickets;
    private int id;
    private static int idCounter = 1;

    public Customer() {
            this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public int getTickets() {
        return tickets;
    }

    public void addTickets(int count) {
        this.tickets = count;
    }

}
