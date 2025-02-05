package NumberSequence;
import Csv.FileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private final static String FILENAME = "fibonacci.csv";
    private static long num1 = 0;
    private static long num2 = 1;
    private static long next = 0;
    public static void main(String[] args) {
        List[] lista = new List[60];
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 2; i <= 60; i++) {
            lista[]
            next = (num1) + (num2);
            num1 = num2;
            num2 = next;
            list.add(next);

            System.out.println(next);
        }

    }
    FileWriter file;
    BufferedWriter bufferedWriter = null;
    String line;
    try {
        file = new FileWriter(FILENAME);
        bufferedWriter = new BufferedWriter(file);
    do {
        while (Long list : list) {
            line = bufferedWriter.write();
        }

    } while () {
        } catch (IOException e){
            System.err.println(e);
        }
    }
    }

}
