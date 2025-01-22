import java.util.Scanner;
import java.util.LinkedHashSet;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            // Lisätään arvot listaan
            arr[i] = sc.nextInt();
        }

        LinkedHashSet<Integer> Numbers = new LinkedHashSet<>();
        for (int num : arr) {
            // Lisätään numerot Hashsettiin
            Numbers.add(num);
        }

        System.out.println("\nThe array without duplicates:");
        for (int num : Numbers) {
            System.out.print(num + " ");
        }
    }
}
