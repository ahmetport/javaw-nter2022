package Day52_Mapentry;

import java.util.HashMap;
import java.util.Map;

public class C03_Mapmethodları {
    public static void main(String[] args) {
        Map<String,Integer>myMap = new HashMap<>();
        myMap.put("H",3);
        myMap.putIfAbsent("K",5);
        myMap.put("A",10);
        System.out.println(myMap);//a nın yerine dirak 10 atar
        myMap.computeIfAbsent("A",v->20);//burda A ZATEN VAR oldugunan degiştirmiyor
        System.out.println(myMap);//{A=10, H=3, K=5}
        myMap.compute("A" ,(key,value) ->20);//burda formül yazıp degiştirdik
        System.out.println(myMap);//{A=20, H=3, K=5}

        //H nin degerini 2 katının 5 fazlası yapalım
        myMap.compute("H" ,(key,value) ->(2*value+5));
        System.out.println(myMap);//{A=20, H=11, K=5}
    }
}
