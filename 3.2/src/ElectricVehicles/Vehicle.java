package ElectricVehicles;


interface ElectricVehicle {
    void charge();
}

abstract class Vehicle implements ElectricVehicle {
    String type;
    String fuel;

    public Vehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }
    public abstract void start();
    public abstract void stop();
    public abstract void getInfo();
}

class Car extends Vehicle {
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
        System.out.println("Car Information: \n" + "Type: " + type + "\n" + "Fuel: " + fuel + "\n" + "Color: " + color + "\n");
    }

    public void charge(){
        System.out.println("Car cannot be charged...");
    }
}

class ElectricCar implements ElectricVehicle {
    String type;
    String fuel;
    String color;
    public ElectricCar(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    public void charge() {
        System.out.println("Car is charging...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public void start() {
        System.out.println("Car is starting...");
    }

    public void getInfo() {
        System.out.println("Electric Car Information: \n" + "Type: " + type + "\n"+ "Fuel: "+ fuel + "\n" + "Color: " + color + "\n");
    }
}

class Motorcycle extends Vehicle {
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
        System.out.println("Motorcycle Information: \n" + "Type: " + type + "\n" + "Fuel: " + fuel + "\n" + "Color: " + color + "\n");
    }
    public void charge(){
        System.out.println("Motorcycle cannot be charged...");
    }

}
class Bus extends Vehicle {
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
        System.out.println("Bus Information: \n" + "Type: " + type + "\n" + "Fuel: " + fuel + "\n" + "Capacity: " + capacity + " passengers\n");
    }

    public void charge(){
        System.out.println("Bus cannot be charged...");
    }
}
