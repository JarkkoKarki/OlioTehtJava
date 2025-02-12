package NumberPrinting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("First number: ");
        int firstNumber = s.nextInt();
        System.out.println("Second number: ");
        int secondNumber = s.nextInt();

        if (firstNumber >= secondNumber) {
            System.out.println("Range is too short.");
        }

        NumberPrinting printing = new NumberPrinting(firstNumber, secondNumber);

        Thread even = new Thread(new Runnable() {
            @Override
            public void run() {
                printing.Even();
            }
        });

        Thread odd = new Thread(new Runnable() {
            @Override
            public void run() {
                printing.Odd();
            }
        });
        odd.start();
        even.start();
    }
}
