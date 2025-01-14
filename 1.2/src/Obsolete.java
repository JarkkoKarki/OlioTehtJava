import java.util.Scanner;

public class Obsolete {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Weight (g): ");
    double weight = scanner.nextDouble();

    double luodit = 13.28;
    double luotiPerNaula = 32;
    double naulaPerLeiviskä = 20;

    double kaikkiluodit = weight / luodit;

    //Lasketaan leiviskät jakamalla luodit  nauloilla ja leivisköillä
    int leiviskät = (int) (kaikkiluodit / (luotiPerNaula*naulaPerLeiviskä));
    // jakojäännöksestä jää käytettävissä olevat luodit
    kaikkiluodit %= (luotiPerNaula*naulaPerLeiviskä);

    //Lasketaan naulat
    int naula = (int) (kaikkiluodit/luotiPerNaula);
    //Lasketaan jäljelle jäävät luodit naulojen jälkeen
    double luoti = kaikkiluodit % luotiPerNaula;

    System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n", weight, leiviskät, naula, luoti);
    }
}
