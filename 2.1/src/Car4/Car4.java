package Car4;

class Car4 {

    private double speed;
    private double gasolineLevel;
    private String typeName;
    private int gasolineTankCapacity;  // Lisätty tank capacity ja topspeed
    private int topSpeed;

    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */

    private boolean cruiseControl = false;
    private double targetSpeed;
    private static final double MIN_CRUISE_SPEED = 30;
    private static final double MAX_CRUISE_SPEED = 40;


    public Car4(String typeName, int gasolineTankCapacity, int topSpeed) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;   // this refers to the object itself.
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.topSpeed = topSpeed;
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
    }
    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        if (gasolineLevel > 0)
            if (speed < topSpeed) { // Tarkistetaan nopeus
                speed += 10;
            } else {
                speed = topSpeed;
            }
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = gasolineTankCapacity; // täytetään tankki
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }

    public boolean turnOnCruiseControl(double targetSpeed) {
        if (targetSpeed >= MIN_CRUISE_SPEED && targetSpeed <= MAX_CRUISE_SPEED && targetSpeed <= topSpeed && gasolineLevel > 0) {
            this.targetSpeed = targetSpeed;
            cruiseControl = true;
            return true;
        } else {
            cruiseControl = false;
            return false;
        }
    }
    public void turnOffCruiseControl() {
        cruiseControl = false;
    }
    public double getCruiseControlSpeed() {
        if (cruiseControl) {
            return targetSpeed;
        } else {
            return 0;
        }
    }

    public void driveCruiseControl() {
        if (cruiseControl) {
            if (gasolineLevel > 0) {
                if (speed < topSpeed) {
                    speed = Math.min(targetSpeed, speed + 5);
                } else if (speed > targetSpeed) {
                    speed = Math.max(targetSpeed, speed - 5);
                }
            } else {
                cruiseControl = false;
                System.out.println("CruiseControl is turned off (low fuel)");
            }
        }
    }
}