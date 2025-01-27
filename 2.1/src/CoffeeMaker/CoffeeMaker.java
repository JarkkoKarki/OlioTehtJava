package CoffeeMaker;

public class CoffeeMaker {
    private String coffeeType;
    private int coffeeAmount;
    private boolean OnOff = false;

    public CoffeeMaker(String coffeeType, int coffeeAmount) {
        this.coffeeType = coffeeType;
        this.coffeeAmount = coffeeAmount;
    }
    public void pressOnOff() {
        if (!OnOff) {
            OnOff = true;
            System.out.println("Coffee maker is on");
        } else {
            OnOff = false;
            System.out.println("Coffee maker is off");
        }
    }
    public void selectCoffeeType() {
        if (OnOff) {
            System.out.println("Coffee type is " + coffeeType);
        }
    }
    public void selectCoffeeAmount() {
        if (OnOff) {
            System.out.println("Coffee amount is " + coffeeAmount + " ml");
        }
    }
}
