package petle;

public class Application {

    public static void main(String[] args) {

        /*for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }*/

        /*for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }*/

        /*int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }*/

        /*for (int i = 300; i <= 1000; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 300; i <= 1000; i++) {

            if (i % 3 == 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }*/

        String napis = "Jestem na dobrej drodze do zoatania profesjonalnym programistą Java";

//        for (int i = 1; i <= 10; i++) {
//            System.out.println("nr. " + i + napis);
//
//        }
//
//        for (int i = 0; i < napis.length(); i++) {
//            System.out.println(napis.length());
//        }
//
//        if (i % 2 == 0) {
//            System.out.println(napis.charAt(i));
//        }

        /*for (int i = 0; i < napis.length(); i++){
            if ((i + 1) % 2 == 0) {
                System.out.print(napis.charAt(i));
            }
        }

        for (int i = napis.length() - 1; i >= 0; i--) {
            System.out.print(napis.charAt(i));
        }

            while (true) {
                System.out.println(napis);
            }*/
    dodawanie(0,1, 5);


    }

    public static void dodawanie(int a, int b, int c) {

        int suma = 0;

        while (suma < c) {
            suma = suma + (a + b);
        }

        System.out.println(suma);
    }

}
