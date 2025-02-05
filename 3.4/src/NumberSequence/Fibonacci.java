package NumberSequence;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private final static String FILENAME = "fibonacci.csv";

    public static void main(String[] args) {
        List<Long> list = Fibonacci(); // Lisätään numerot Arraylistaan
        Csv(list); // Kirjoitetaan ArrayList csv tiedostoon
        System.out.println("Csv written successfully");
    }

    public static List<Long> Fibonacci() {
        List<Long> list = new ArrayList<>();
        long num1 = 0;
        long num2 = 1;
        long next = 0;
        // System.out.println(num1);
        // System.out.println(num2);
        list.add(num1);
        list.add(num2);
        for (int i = 2; i <= 60; i++) {
            next = (num1) + (num2);
            list.add(next);
            num1 = num2;
            num2 = next;
            // System.out.println(next);
        }
        return list;
    }

    public static void Csv(List<Long> list) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            writer.write("Fibonacci Numbers;");
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i) + ";");
            }
        } catch (IOException e) {
            System.out.println("Kirjoittaminen väärin");
        }
    }
}
