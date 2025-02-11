public class Theater {
    private int seats;

    public Theater(int seats) {
        this.seats = seats;
    }

    public void reserveSeats(Customer customer, int count) {
        synchronized (this) {
            this.seats -= count;
            customer.addTickets(count);
        }
        System.out.println("Paikkoja varattu: " + customer.getId() + ", varasi: " + count + ", lippua. Kaikki liput: " + customer.getTickets());
    }

    public int getSeats() {
        return seats;
    }

}
