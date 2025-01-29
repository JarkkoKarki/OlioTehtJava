package CarDriver;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 100, 140);
        SportsCar newCar = new SportsCar("Ferrari", 250, 200, 20);


        myCar.fillTank();
        for (int i = 0; i < 40; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        System.out.println();

        newCar.fillTank();
        for (int i = 0; i < 40; i++) {
            newCar.accelerate();
            System.out.println(newCar.getTypeName() + ": speed is " + newCar.getSpeed() + " km/h");
        }
        while (newCar.getSpeed() > 0) {
            newCar.decelerate(15);
            System.out.println(newCar.getTypeName() + ": speed is " + newCar.getSpeed() + " km/h");
        }
    }
}