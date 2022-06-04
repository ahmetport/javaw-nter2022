package Day25_Arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C05_Listıtekrarsızyap {
    public static void main(String[] args) {
        //verilen bir listede  tekrar eden sayıları sadece 1 tane yapan bir method oluşturun
       //örn :[1,3,5,3,5,6,1,7]
        //[1,3,5,6,7]bu hale dönüşşsun
        List<Integer> sayılar = new ArrayList<>();
        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(6);
        sayılar.add(1);
        sayılar.add(7);

         sayılar=tekrarsızlisteoluştur1(sayılar);//method  sayılar listesine atadım oluştururken atama yaptık
         //java kendi return type nı verdi
        System.out.println(sayılar);//return yaptıktan sonra mainin içinde yazdırmak için atama yapılmış hali

    }

    public static List<Integer> tekrarsızlisteoluştur1(List<Integer> sayılar) {//atama yaparsak otomatik kendisi ınteger getirir
        List<Integer>tekrarsızlist=new ArrayList<>();
        for (int i = 0; i <sayılar.size (); i++) {
            if(!tekrarsızlist.contains(sayılar.get(i))){
                tekrarsızlist.add(sayılar.get(i));
            }
        }
        return tekrarsızlist;//yazdırmıyoruz return ile main methoda döndürüyoruz

    }


}




