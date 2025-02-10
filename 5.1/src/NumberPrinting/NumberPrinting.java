package NumberPrinting;

import java.util.Scanner;

public class NumberPrinting implements Runnable {
    private int firstNumber;
    private int secondNumber;

    public NumberPrinting(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void run() {
        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i < secondNumber; i++) {
                if (i % 2 == 1) {
                    System.out.println("Odd Thread: " + i);
                }
            }
        } else {
            System.out.println("Range Is too short");
        }

    }
    public int getFirstNumber(){
        return firstNumber;
    }
    public int getSecondNumber() {
        return secondNumber;
    }
}
