package Day46_Iterator_Collectıons;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04Soru {
    public static void main(String[] args) {
        //bir listedeki istenen sayı aralıgında olmayan elementleri silen bir program yazınız
        //örnek [2,13,56,23,45,14,40] 20 ile 40 arasında olanları silecegiz
        List<Integer> liste = new ArrayList<>();

        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        ListIterator itr = liste.listIterator();

        while(itr.hasNext()){
            Object sayı=itr.next();
            if(!((Integer)(sayı)>=20 && (Integer)sayı<=40)){
                itr.remove();
            }
        }

        System.out.println(liste);









    }
}
