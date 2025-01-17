import java.util.Scanner;

public class Multiplicaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        while (score < 10) {
            for (int i = 0; i < 10; i++) {
                System.out.print("\nYour Score is: " + score + " / 10\n");
                int first = (int) (Math.random() * 10) + 1;
                int second = (int) (Math.random() * 10) + 1;
                System.out.println("\nSolve the multiplication of: ");
                System.out.printf("%d * %d = ", first, second);
                int answer = sc.nextInt();
                if (answer == first * second) {
                    score++;
                } else {
                    System.out.print("Wrong! Right answer is: ");
                    System.out.printf("%d\n", first * second);
                    score = 0;
                    break;
                }
            }
        }
        System.out.println("You win!");
        System.out.println("Score: " + score);
    }
}
