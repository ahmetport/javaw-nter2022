package Day49_Maps;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class C03_Listeyidüzenliyazdır {
    public static void main(String[] args) {
        //sınıf listesini düzenli bir şekilde yazmak
     Map<Integer,String>sınıf=C02_MapOluştur.myMap();
        System.out.println(sınıf);
        sınıflistyazdır(sınıf);

    }

    public static void sınıflistyazdır(Map<Integer, String> sınıf) {
        System.out.println("numara isim soyisim Branş");
        System.out.println("=============================");
        Set<Integer> keyset=sınıf.keySet();
        Collection<String> valeuset=sınıf.values();
        for (String each:valeuset

             ) {
            System.out.println(each);//şimdi biz istedigimiz şekle getirdik map imizi şimdi bunu manüpüle edecegiz




            }
        }
    }





