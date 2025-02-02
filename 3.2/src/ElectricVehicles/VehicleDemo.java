package ElectricVehicles;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Car", "Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        Bus bus = new Bus("Bus", "Diesel", 40);
        ElectricCar electricCar = new ElectricCar("Electric Car","Electric", "Violet");
        car.start();
        car.stop();
        car.getInfo();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
        motorcycle.charge();
        bus.start();
        bus.stop();
        bus.getInfo();
        electricCar.start();
        electricCar.stop();
        electricCar.getInfo();
        electricCar.charge();
    }
}
