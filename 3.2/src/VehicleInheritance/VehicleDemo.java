package VehicleInheritance;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Car", "Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        Bus bus = new Bus("Bus", "Diesel", 40);

        car.start();
        car.stop();
        car.getInfo();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
        bus.start();
        bus.stop();
        bus.getInfo();
    }
}
