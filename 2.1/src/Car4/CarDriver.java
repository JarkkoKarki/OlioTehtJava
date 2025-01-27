package Car4;

public class CarDriver {
    public static void main(String[] args) {
        Car4 myCar;

        myCar = new Car4("Toyota Corolla", 200, 80);
        myCar.fillTank();

        for (int i = 0; i < 3; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        System.out.println("Setting the cruise control to 40km/h");
        boolean cruiseControl = myCar.turnOnCruiseControl(40);

        if (cruiseControl) {
            System.out.println("Setting the cruise control to " + myCar.getCruiseControlSpeed() + " km/h");
        } else {
            System.out.println("Cruise control could not be enabled");
        }

        for (int i = 0; i < 10; i++) {
            myCar.driveCruiseControl();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        myCar.turnOffCruiseControl();
        System.out.println("Cruise control turned off. speed is " + myCar.getSpeed() + " km/h");


        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}