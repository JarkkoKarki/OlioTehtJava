public class Main extends Thread{
    static Theater t = new Theater(100);

    public static void main(String[] args) {
        Thread c1 = new Thread(() -> {
            Customer customer = new Customer();
            t.reserveSeats(customer, 3);
        });

        Thread c2 = new Thread(() -> {
            Customer customer = new Customer();
            t.reserveSeats(customer, 5);
        });

        Thread c3 = new Thread(() -> {
            Customer customer = new Customer();
            t.reserveSeats(customer, 4); // May fail if not enough seats are left
        });

        c1.start();
        c2.start();
        c3.start();
    }
    }
