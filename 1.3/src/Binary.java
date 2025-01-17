import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a binary number: ");
        String number = scanner.nextLine();
        int decimal = 0;
        int length = number.length();

        // Starting at the least significant bit (0011 = calculates = 1*2^0 + 1*2^1 + 0*2^2 + 0*2^3)
        for (int i = 0; i < length; i++) {
            char ch = number.charAt(length - 1 - i);
            if (ch == '1') {
                decimal += (int) Math.pow(2, i);
            }
        }
        System.out.println("Decimal number: " + decimal);
    }
}
