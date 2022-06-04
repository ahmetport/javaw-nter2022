package Day51_Mapss;

import java.util.HashMap;
import java.util.Map;

public class C01_mapsss {
    public static void main(String[] args) {
        //verilenbir stringdeki  harfleri ve  kaçar kez kullanıldıgını return eden bir method yazınız
        String input="Hellooo";
        String harflerArr[]=input.split("");//stringi arrey e çeviriyoruz
        Map<String,Integer> kullanımsayıları=new HashMap<>();//key burda harf ve value ınteger boş bir map oluşturduk
        for (String each:harflerArr
        ) {
            if(kullanımsayıları.containsKey(each)){// h yi kontrol ediyoruz benim map ımda var mı varsa if yap yoksa else yap
                kullanımsayıları.put(each ,kullanımsayıları.get(each) +1);//var olana 1 ekleyecegiz ilk l de çalışır l nin var olan
                //degerini getirir l=1 vardı şimdi ikiyi eklicem eski l yi öldürecek yeni bir l atayacak l=2 olacak
                //çünkü key ın içinde iki l olmaz ilkini öldür ikinciyi ekle
            }else{
                kullanımsayıları.put(each,1);
            }
        }
        System.out.println(kullanımsayıları);

    }
}
