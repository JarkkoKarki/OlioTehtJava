package Car;

class Car {

    private double speed;
    private double gasolineLevel;
    private String typeName;
    private int gasolineTankCapacity;  // Lisätty tank capacity ja topspeed
    private int topSpeed;

    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName, int gasolineTankCapacity, int topSpeed) {
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
                speed += 20;
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
}