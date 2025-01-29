package CarDriver;

class Car {

    private int speed;
    private double gasolineLevel;
    private String typeName;
    private int gasolineTankCapacity;
    private int topSpeed;

    public Car(String typeName, int gasolineTankCapacity, int topSpeed) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            if (speed < topSpeed) {
                speed += 10;
                gasolineLevel -= 2;
            } else {
                speed = topSpeed;
                gasolineLevel -= 2;
            }

        else {
            speed = 0;
        }
    }

    void decelerate(int amount) {
        if (speed - amount > 0) {
            if (amount > 0)
                speed -= amount;
        } else {
            speed = 0;
        }
    }

    int getTopSpeed() {
        return topSpeed;
    }

    int getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = gasolineTankCapacity;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setGasolineLevel(double gasolineLevel) {
        this.gasolineLevel = gasolineLevel;
    }

}