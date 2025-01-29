package Bus;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 100, 140);
        Bus myBus = new Bus("Bus", 100, 80, 5);

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

        myBus.fillTank();
        myBus.passengerEnter();
        myBus.passengerEnter();
        myBus.passengerEnter();
        myBus.passengerEnter();
        for (int i = 0; i < 40; i++) {
            myBus.accelerate();
            System.out.println(myBus.getTypeName() + ": speed is " + myBus.getSpeed() + " km/h");
        }
        while (myBus.getSpeed() > 0) {
            myBus.decelerate(15);
            System.out.println(myBus.getTypeName() + ": speed is " + myBus.getSpeed() + " km/h");
        }
        myBus.passengerExit();
        myBus.passengerExit();
        myBus.passengerExit();
        myBus.passengerExit();
    }
}