package Calculator;

public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void reset() {
        this.value = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        this.value += number;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(10);
        System.out.println("Current value: " + calculator.getValue()); // Output: 15
        calculator.reset();
        System.out.println("Current value after reset: " + calculator.getValue()); // Output: 0
        try {
            calculator.add(3);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage()); // Output: Negative numbers are not allowed
        }
    }
}