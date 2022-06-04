package Day25_Arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C04_Listedentekrarlıelementlerisilme {
    public static void main(String[] args) {
        //verilen bir listede  tekrar eden sayıları sadece 1 kere yazdıran method oluşturun

        List<Integer> sayılar = new ArrayList<>();
        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(6);
        sayılar.add(1);
        sayılar.add(7);
        tekrarsızlisteoluştur(sayılar);
        System.out.println(sayılar);//ilkini yazar atama yapmadım orjinali degişmez

    }

    public static void tekrarsızlisteoluştur(List<Integer> sayılar) {
        List<Integer> tekrarsızlist = new ArrayList<>();
        for (int i = 0; i < sayılar.size(); i++) {
            if (!tekrarsızlist.contains(sayılar.get(i))) {
                tekrarsızlist.add(sayılar.get(i));
            }
        }
        System.out.println(tekrarsızlist);

    }
}
