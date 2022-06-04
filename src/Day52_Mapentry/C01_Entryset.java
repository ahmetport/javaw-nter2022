package Day52_Mapentry;

import Day49_Maps.C02_MapOluştur;

import java.util.Map;
import java.util.Set;

public class C01_Entryset {
    public static void main(String[] args) {
        Map<Integer,String> sınıflistmap=C02_MapOluştur.myMap();
        sınıflistmap.entrySet();
        System.out.println(sınıflistmap.entrySet());//[101=nazan, can, Dev, 102=veli, yan, qa, 103=ali, yan, Dev, 104=rıza, yan, Java, 105=fatma, yan, Dev]
        Set<Map.Entry<Integer,String>>sınıfentryseti=sınıflistmap.entrySet();
        //mymap..entryset(); methodu bize entrylerden oluşan bir set döndürüyor eger bu entryleri manıpule etmek istiyorsak
        //methodun döndürdügü seti yeni bir set oluşturup store etmeliyiz
        System.out.println("No  isim  soyisim  branş ");
        for (Map.Entry<Integer,String> each:sınıfentryseti
             ) {
            Integer entrykey=each.getKey();
            String valuestr=each.getValue();
            String valueArr[]=valuestr.split(", ");
            System.out.printf("%-4d %-6s %-9s %s\n", entrykey,valueArr[0],valueArr[1],valueArr[2]);//printf ile yazdırdık


        }

    }
}
