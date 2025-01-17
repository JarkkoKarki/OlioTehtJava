import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        String[] firstName = {"Matti", "Pekka", "Vilho", "Petteri", "Mikael", "John", "Mikko"};
        String[] secondName = {"Mikkonen", "Nurminen", "Suvanto", "Paasikivi", "Vijanen", "Toivanen", "Valkinen"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many names you want to generate? ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int first = (int)(Math.random()*7)+1;
            int second = (int)(Math.random()*7)+1;
            System.out.printf("%s %s\n", firstName[first-1], secondName[second-1]);
        }
    }

}
