import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first primary numbers: ");
        int a = sc.nextInt();
        System.out.println("Enter second primary numbers: ");
        int b = sc.nextInt();


        // Tarkistetaan kaikki luvut a:n ja b:n välillä
        for (int i = a; i <= b; i++) {
            if (prime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean prime(int n) {
        // Luvun tulee olla suurempaa kuin 1
        if (n <= 1) {
            return false;
        }
        // Tarkistetaan onko luvu jaettavissa muilla luvuilla
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
