import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature = Double.parseDouble(scanner.nextLine());
        double celsius = (temperature-32)*5/9;
        System.out.printf("Temperature is: %.1f Celsius", celsius);

    }
}
