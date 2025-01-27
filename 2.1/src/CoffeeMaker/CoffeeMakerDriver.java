package CoffeeMaker;

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker;
        coffeeMaker = new CoffeeMaker("espresso", 50);
        coffeeMaker.pressOnOff();
        coffeeMaker.selectCoffeeType();
        coffeeMaker.selectCoffeeAmount();
        coffeeMaker.pressOnOff();

    }
}
