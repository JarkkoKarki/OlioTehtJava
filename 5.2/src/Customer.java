public class Customer {
    private int tickets;
    private int id;

    public Customer() {
        id++;
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
