package s.filtering;

import java.util.Arrays;
import java.util.List;

public class Filtering {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(n -> n % 2 != 0) // Parilliset numerot pois
                .mapToInt(n -> n * 2)    // 2x jokainen jäljelle jäänyt nro.
                .sum();                  // Lasketaan summa.

        System.out.println("Sum: " + sum);
    }
}