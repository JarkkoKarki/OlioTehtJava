package NumberPrinting;

import java.util.Scanner;

public class NumberPrinting {
    private int firstNumber;
    private int secondNumber;

    public NumberPrinting(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void Even() {
        for (int i = firstNumber; i <= secondNumber; i++)
            if (i % 2 == 0) {
                System.out.println("Even Thread: " + i);
            }
    }

    public void Odd() {
        for (int i = firstNumber; i <= secondNumber; i++)
            if (i % 2 == 1) {
                System.out.println("Odd Thread: " + i);
            }
    }
}
