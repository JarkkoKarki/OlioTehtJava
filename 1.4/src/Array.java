import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sum = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0, temp = 0;
        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = temp;
                end = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
                temp = i + 1;
            }
        }
        System.out.println("\nMaximum sum: " + maxSum);
        System.out.println("Integers: " + (start + 1) + "-" + (end + 1));
    }
}
