package zadania;
import java.util.Scanner;

public class WczytajProstokat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę całkowite.");
        int liczba1 = scan.nextInt();
        System.out.println("Podaj drugą liczbę całkowite.");
        int liczba2 = scan.nextInt();

        for (int i = 0; i <= liczba1; i++) {
            for (int j = 0; j <= liczba2; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
