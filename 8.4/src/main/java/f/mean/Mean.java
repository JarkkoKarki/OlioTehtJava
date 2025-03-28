package f.mean;

import java.util.Arrays;

public class Mean {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        double mean = Arrays.stream(numbers)
                .average()
                .orElse(Double.NaN);

        System.out.println("Mean: " + mean);
    }
}