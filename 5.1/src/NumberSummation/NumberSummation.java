package NumberSummation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSummation {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available processor cores: " + cores);

        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 100000; i++) {
            list.add(rand.nextInt(10) + 1);
        }
        List<Sum> threads = new ArrayList<>();

        int chunkSize = list.size() / cores;

        for (int i = 0; i < list.size(); i += chunkSize) {
            int end = i + chunkSize;
            if (end > list.size()) { // Jos kyseessä on viimeinen osuus varmistetaan, ettei listan kokoa ylitetä
                end = list.size();
            }

            Sum s = new Sum(list, i, end);
            threads.add(s);
            s.start();
        }

        long totalSum = 0;
        for (Sum thread : threads) {
            try {
                thread.join();
                totalSum += thread.getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total sum: " + totalSum);
    }
}
