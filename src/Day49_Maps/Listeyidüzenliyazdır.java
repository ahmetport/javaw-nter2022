package Day49_Maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Listeyidüzenliyazdır {
    public static void main(String[] args) {
        //listeyi düzenli yazdır
        Map<Integer,String>sınıf=C02_MapOluştur.myMap();
        sınıfListyazdır(sınıf);
    }

    public static void sınıfListyazdır(Map<Integer, String> sınıf) {
        System.out.println("numara isim soyisim Branş");
        System.out.println("=============================");
        Set<Integer> keySets=sınıf.keySet();
        Collection<String>valueSet=sınıf.values();

        for (Integer each:keySets){
            String values=sınıf.get(each);
            String valuesarr[]=values.split("");
            int index=0;
            while(index< valuesarr.length-1)
                System.out.println();


        }



        }
    }

