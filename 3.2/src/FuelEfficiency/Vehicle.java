package FuelEfficiency;


interface ElectricVehicle {
    void charge();
}

interface Vehicle {
    void start();
    void stop();
    void getInfo();
    double calculateFuelEfficiency();
}

abstract class Vehicles implements Vehicle, ElectricVehicle {
    String type;
    String fuel;
    double fuelEfficiency;

    public Vehicles(String type, String fuel, double fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void charge() {
        System.out.println("Cannot be charged!");
    }
    @Override
    public double calculateFuelEfficiency() {
        return this.fuelEfficiency;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void getInfo();

}

class Car extends Vehicles {
    String color;

    public Car(String type, String fuel, String color, double fuelEfficiency) {
        super(type, fuel, fuelEfficiency);
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

    @Override
    public void charge(){
        System.out.println("Car cannot be charged...");
    }
}

class ElectricCar extends Vehicles{
    String color;
    public ElectricCar(String type, String fuel, String color, double fuelEfficiency) {
        super(type, fuel, fuelEfficiency);
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println("Car is charging...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void getInfo() {
        System.out.println("Electric Car Information: \n" + "Type: " + type + "\n"+ "Fuel: "+ fuel + "\n" + "Color: " + color + "\n");
    }
}

class Motorcycle extends Vehicles {
    String color;

    public Motorcycle(String type, String fuel, String color, double fuelEfficiency) {
        super(type, fuel, fuelEfficiency);
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
    @Override
    public void charge(){
        System.out.println("Motorcycle cannot be charged...");
    }

}
class Bus extends Vehicles {
    int capacity;
    public Bus(String type, String fuel, int capacity, double fuelEfficiency) {
        super(type, fuel, fuelEfficiency);
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

    @Override
    public void charge(){
        System.out.println("Bus cannot be charged...");
    }
}
