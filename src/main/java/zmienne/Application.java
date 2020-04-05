package zmienne;

import jdk.swing.interop.SwingInterOpUtils;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World");


        int i = 5;
        double d = 5.1;
        float f = 10;

        System.out.println(i);
        System.out.println(d);
        System.out.println(f);

        System.out.println(i*d);

        i = (int) d;

        System.out.println(i);

        d = i;

        System.out.println(dodaj(5, 5));
        System.out.println(odejmij(10, 2));
        System.out.println(pomnoz(5, 5));

        System.out.println(czyParzysta(5));
        System.out.println(czyParzysta(8));
        System.out.println(czyParzysta(9));

    }

    public static int dodaj(int a, int b) {
        return a + b;
    }

    public static int odejmij(int a, int b) {
        return a - b;
    }

    public static int pomnoz(int a, int b) {
        return a * b;
    }

    /*public static int podziel(int a, int b) {
        return ((double) a) / b;
    }*/

    public static boolean czyParzysta(int a) {
        return a % 2 == 0;
    }



}
