package Day46_Iterator_Collectıons;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_Listeyiterstenyazdırma {
    public static void main(String[] args) {
        //verilen bir listeyi sondan başa dogru yazdıralım
        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        //önce ıtr oluşturup sona yollayalım
        ListIterator itr=liste.listIterator();
        while(itr.hasNext()) {
            itr.next();
        }
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");//9 6 8 7 5
        }











    }
}
