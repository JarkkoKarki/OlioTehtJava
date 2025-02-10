package NumberPrinting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner s = new Scanner(System.in);
        System.out.println("First number");
        firstNumber = s.nextInt();
        System.out.println("Second number");
        secondNumber = s.nextInt();
        Runnable w = new NumberPrinting(firstNumber, secondNumber);
        Thread t = new Thread(w);
        t.start();
        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i < secondNumber; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even Thread: " + i);
                }
            }
        } else {
            System.out.println("Range Is too short");
        }

    }
}
