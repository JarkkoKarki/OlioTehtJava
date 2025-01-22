import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sum = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Käydään läpi kaikki numerot
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            // Tallennetaan numerot listaan
            arr[i] = sc.nextInt();
        }
        int currentSum = 0; // Tämän hetkinen summa
        int maxSum = Integer.MIN_VALUE; // Maksimi summa
        int start = 0, end = 0, temp = 0; // Alku ja loppu maksimi arvoihin / temp laskee seuraavaa subarrayn arvoa
        for (int i = 0; i < n; i++) {
            currentSum += arr[i]; // Lisätään arvo summaan
            if (currentSum > maxSum) {  // Jos summa on isompi päivitetään maksimi summaa
                maxSum = currentSum;
                start = temp; // Päivitetään alku arvo
                end = i; // Päivitetään loppuarvo
            }
            if (currentSum < 0) { // Jos arvo on negatiivinen
                currentSum = 0; // resetoidaan summa, koska etsitään isointa summaa.
                temp = i + 1; // Päivitetään temp seuraavaa varten
            }
        }
        System.out.println("\nMaximum sum: " + maxSum);
        System.out.println("Integers: " + (start + 1) + "-" + (end + 1));
    }
}
