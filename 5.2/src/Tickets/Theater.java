package Tickets;

public class Theater {
    private int seats;

    public Theater(int seats) {
        this.seats = seats;
    }

    public synchronized void reserveSeats(Customer customer, int count) {
        if (seats >= count) {
            this.seats -= count;
            customer.addTickets(count);
            System.out.println("Käyttäjä: "+ customer.getId() +  ", varasi: " + count + " lippua. Kaikki liput: " + customer.getTickets() + ". Paikkoja vapaana: " + seats);
        } else {
            System.out.println("Ei Tarpeeksi paikkoja");
        }
    }

    public int getSeats() {
        return seats;
    }

}
