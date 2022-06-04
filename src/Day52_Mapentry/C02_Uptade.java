package Day52_Mapentry;

import Day49_Maps.C02_MapOluştur;

import java.util.Map;
import java.util.Set;

public class C02_Uptade {
    //verilen mapdeki tüm branşları java yapalım
    public static void main(String[] args) {
        Map<Integer,String> sınıfListmap= C02_MapOluştur.myMap();
        System.out.println(sınıfListmap);
        Set<Map.Entry<Integer,String>> sınıfentryset=sınıfListmap.entrySet();

        for (Map.Entry<Integer,String>each:sınıfentryset
             ) {
            Integer keyEntry=each.getKey();
            String valueEntry=each.getValue();
            String valueArr[]=valueEntry.split(", ");
            valueArr[2]="java";
            String valueYeni=valueArr[0]+ ", "+ valueArr[1]+ ", "+ valueArr[2];
            sınıfListmap.put(keyEntry,valueYeni);
        }
        System.out.println(sınıfListmap);
    }
}
