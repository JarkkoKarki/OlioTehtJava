package Tickets;

public class MainTest extends Thread{
    static Theater t = new Theater(10);


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
            t.reserveSeats(customer, 4);
        });
        System.out.println("Paikkoja: " + t.getSeats());
        c1.start();
        c2.start();
        c3.start();
    }
    }
