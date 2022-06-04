package Day46_Iterator_Collectıons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02 {
    public static void main(String[] args) {
        //listedeki her elemanı 3 arttırın
        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        ListIterator itr = liste.listIterator();

        //listenin tüm elementlerini bize getirmesi için ıtr yi has ve next methodlarını beraber kullanacagız
        while (itr.hasNext()) {//yanında element oldugu müddetçe çalışacak true dönecek 9 kadar
            Object sayı = itr.next();
            itr.set((Integer)sayı+3);
        }
        System.out.println(liste);
    }
}