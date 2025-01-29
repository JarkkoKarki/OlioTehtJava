package CarDriver;

public class SportsCar extends Car {
    private int fuelEfficiency;

    public SportsCar(String typeName, int gasolineTankCapacity, int topSpeed, int fuelEfficiency) {
        super(typeName, gasolineTankCapacity, topSpeed);
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            if (getSpeed() < getTopSpeed()) {
                int newSpeed = (int)getSpeed() + fuelEfficiency;
                setSpeed(newSpeed);
                int newGasolineLevel = (int)getGasolineLevel() - fuelEfficiency;
                setGasolineLevel(newGasolineLevel);
            }
        }
    }
    @Override
    void decelerate(int amount) {
        if (getSpeed() - amount > 0) {
            if (amount > 0)
                setSpeed((int)getSpeed()-amount);
        } else {
            setSpeed(0);
        }
    }
    public int getFuelEfficiency() {
        return fuelEfficiency;
    }
}
