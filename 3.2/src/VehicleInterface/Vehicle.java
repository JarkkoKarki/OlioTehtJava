package VehicleInterface;

interface Vehicle {
    void start();
    void stop();
    void getInfo();
}

class Car implements Vehicle {
    String type;
    String fuel;
    String color;

    public Car(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;


    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
    @Override
    public void getInfo() {
        System.out.println("Car Information: \n" + "Type: " + type + "\n" + "Fuel: " + fuel + "\n" + "Color: " + color + "\n");
    }
}
class Motorcycle implements Vehicle {
    String type;
    String fuel;
    String color;

    public Motorcycle(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }
    @Override
    public void getInfo() {
        System.out.println("Motorcycle Information: \n" + "Type: " + type + "\n" + "Fuel: " + fuel + "\n" + "Color: " + color + "\n");
    }

}
class Bus implements Vehicle {
    String type;
    String fuel;
    int capacity;
    public Bus(String type, String fuel, int capacity) {
        this.type = type;
        this.fuel = fuel;
        this.capacity = capacity;
    }
    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }
    @Override
    public void getInfo() {
        System.out.println("Bus Information: \n" + "Type: " + type + "\n" + "Fuel: " + fuel + "\n" + "Capacity: " + capacity + " passengers\n");
    }
}
