Calculator that has the ability to sum positive integers. A negative integer should throw an exception


```
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
```

Fields:  
```
private int value; - This field stores the current sum of the calculator.
```
Constructor:  
```
public Calculator() - Initializes the value field to 0.
```
Methods:  
```
public void reset() - Resets the value field to 0.
public void add(int number) - Adds a positive integer to the value field. If the number is negative, it throws an IllegalArgumentException.
public int getValue() - Returns the current value of the value field.
```
Main Method:  
```
Demonstrates the usage of the Calculator class by creating an instance, adding numbers, resetting the value, and handling exceptions for negative numbers.
```