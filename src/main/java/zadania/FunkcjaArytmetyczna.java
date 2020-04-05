package zadania;



import java.util.ArrayList;
import java.util.List;

public class FunkcjaArytmetyczna {

    public static void main(String[] args) {

//        List<Integer> lista = new ArrayList<>();
//        ArrayList<Integer> lista2 = new ArrayList<>();
//
//        sumaLiczbZListy(lista2);
//        sumaLiczbZListy(lista);


        System.out.println(stworzCiagArytmetyczny(5, 6, 7));

    }

   public static int sumaLiczbZListy (List<Integer> lista) {
        return 0;
   }

// Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie, różnicy ciągu

    public static List<Integer> stworzCiagArytmetyczny(int dlugosc, int pierwszy, int roznica) {

        List<Integer> ciag = new ArrayList<>();
        // tracimy info o ArrayList
        // ograniczanie przydaje się, bo nadal mamy metody z ArrayList
        // a można potem bez problemu zmienić np. z ArrayList na LinkedList

        ciag.add(pierwszy);
        for (int i = pierwszy; i < dlugosc; i++) {
            ciag.add(pierwszy + i * roznica);
        }
        return ciag;
    }




}
