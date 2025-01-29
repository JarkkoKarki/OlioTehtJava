package Bus;

public class Bus extends Car {
    private int passengers;
    private int maxPassengers;

    public Bus(String typeName, int gasolineTankCapacity, int topSpeed, int maxPassengers) {
        super(typeName, gasolineTankCapacity, topSpeed);
        this.passengers = 0;
        this.maxPassengers = maxPassengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void passengerEnter() {
        if (passengers < maxPassengers) {
            passengers++;
            System.out.println("Passenger entered: " + passengers + " passengers");
        } else {
            System.out.println("Buss is full Passengers: ");
        }
    }
    public void passengerExit() {
        if (passengers > 0) {
            passengers--;
            System.out.println("Passenger exited: " + passengers + " passengers");
        } else {
            System.out.println("Buss is Empty");
        }
    }
}
