import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        int a = scanner.nextInt();
        System.out.println("b: ");
        int b = scanner.nextInt();
        System.out.println("c: ");
        int c = scanner.nextInt();
        double d = Math.pow(b,2)-4*a*c;
        if (d > 0) {
            System.out.println("x2 = " + (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
            System.out.println("x2 = " + (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
        } else if (d == 0) {
            System.out.println("x1 = x2 = " + (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
        } else if (d < 0) {
            System.out.println("x1 = " + ((-b)/(2*a)+Math.sqrt(4*a*c-Math.pow(b,2)))/(2*a));
            System.out.println("x2 = " + ((-b)/(2*a)-Math.sqrt(4*a*c-Math.pow(b,2)))/(2*a));
        }
    }
}
