package zadania;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

// Dla zadanej tablicy intów wyświetl najmniejszą oraz największą liczbę z tablicy

public class TabliceCd {

    public static void main(String[] args) {

        // 1 metoda
        int[] nieposortowanaTablica = new int[]{1,3,3,2,4,1};
//        Arrays.sort(nieposortowanaTablica);
//
//        int minValue = nieposortowanaTablica[0];
//        int maxValue = nieposortowanaTablica[nieposortowanaTablica.length-1];
//
//        System.out.println(minValue);
//        System.out.println(maxValue);

       // 2 metoda

        int[] nowaTablica = new int[]{5, 10, 19, 20, 3, 6, 8};

        Arrays.sort(nowaTablica);
        System.out.println(Arrays.toString(nowaTablica));

        //NumberUtils.max()

    }
}



