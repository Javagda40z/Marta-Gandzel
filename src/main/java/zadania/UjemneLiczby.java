package zadania;

// Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych.
// Jeśli takie występują utwórz nową tablicę, do której przepisze tylko te ujemne liczby

import java.util.Arrays;

public class UjemneLiczby {

    public static void main(String[] args) {

        int[] tablica = new int[]{9, -7, 8, -6, -8, -4, 22, 6};
        int[] tablicaUjemnych = new int[tablica.length];
        int iloscUjemnych = 0;
        int iteracja = 0;

        for (int i : tablica) {

            if (i < 0) {
                tablicaUjemnych[iteracja] = i;
                iteracja++;
                iloscUjemnych++;

            }
            System.out.println(Arrays.toString(tablicaUjemnych));


        }
    }
}

        //public static int[] policzUjemne(int[] tablica) {

        //for (int i : tablica) {

