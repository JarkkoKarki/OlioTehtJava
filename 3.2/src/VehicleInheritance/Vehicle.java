package VehicleInheritance;
interface Vehicle {
    void start();
    void stop();
    void getInfo();
}

abstract class AbstractVehicle implements Vehicle {
    String type;
    String fuel;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }
    public abstract void start();
    public abstract void stop();
    @Override
    public void getInfo() {
        System.out.println("Vehicle Information: \n" + "Type: " + type + "\n" + "Fuel: " + fuel + "\n");
    };
}

class Car extends AbstractVehicle {
    String color;

    public Car(String type, String fuel, String color) {
        super(type, fuel);
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
        System.out.println("Vehicle Information: \n" + "Type: " + type + "\n"+ "Fuel: "+ fuel+ "\n" + "Color: " + color + "\n");
    }
}
class Motorcycle extends AbstractVehicle {
    String color;

    public Motorcycle(String type, String fuel, String color) {
        super(type, fuel);
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
        System.out.println("Vehicle Information: \n" + "Type: " + type + "\n"+ "Fuel: "+ fuel+ "\n" + "Color: " + color + "\n");
    }

}
class Bus extends AbstractVehicle {
    int capacity;
    public Bus(String type, String fuel, int capacity) {
        super(type, fuel);
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
        System.out.println("Vehicle Information: \n" + "Type: " + type + "\n"+ "Fuel: "+ fuel+ "\n" + "Capacity: " + capacity + "\n");
    }
}
