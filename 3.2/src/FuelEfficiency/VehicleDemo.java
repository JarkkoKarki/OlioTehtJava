package FuelEfficiency;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Car", "Petrol", "Red", 5); // l/100km
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black", 2);
        Bus bus = new Bus("Bus", "Diesel", 40, 20);
        ElectricCar electricCar = new ElectricCar("Electric Car","Electric", "Violet", 15); // kWh/100km
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
        System.out.println(car.type +" Fuel Efficiency: " + car.calculateFuelEfficiency() + " l/100km" );
        System.out.println(motorcycle.type + " Fuel Efficiency: "+ motorcycle.calculateFuelEfficiency() + " l/100km" );
        System.out.println(bus.type + " Fuel Efficiency: " + bus.calculateFuelEfficiency()+ " l/100km" );
        System.out.println(electricCar.type + " Fuel Efficiency: " + electricCar.calculateFuelEfficiency() + " kWh/100km");

    }
}
