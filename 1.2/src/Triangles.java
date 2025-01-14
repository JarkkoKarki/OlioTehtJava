import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First leg of a triangle");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Second leg of a triangle");
        int second = Integer.parseInt(scanner.nextLine());
        double hypotenuse = Math.sqrt(Math.pow(first, 2) + Math.pow(second, 2));
        System.out.println(hypotenuse);
    }
}
