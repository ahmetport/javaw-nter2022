package Day50_maps;

import Day49_Maps.C02_MapOluştur;

import java.util.*;

public class C01_Mapssoru {
    public static void main(String[] args) {
        //sınıf listesini düzenli bir şekilde yazmak
        Map<Integer,String> sınıflistMap= C02_MapOluştur.myMap();
        System.out.println(sınıflistMap);//burda sadece map oluşturduk diger classdan oluşturdugumuz map ı çagırdık


        Set<Integer>sınıfkeyseti=sınıflistMap.keySet();//keyseti ilk önce sete attık
        List<Integer>keylist=new ArrayList<Integer>();//sonrada list oluşturduk
        //eger key lere tek tek ulaşmak istedigimizde map de index olmaz index i destekleyen bir yapıya ihtiyacimiz var oda list te çevirme
        keylist.addAll(sınıfkeyseti);//list e atadık artık index i kullanarak key lere tek tek ulaşabilir ve yazdırabiliriz

        //şimdide value lere index ile ulaşabilecegimiz bir şekle sokalım
        Collection<String>sınıfvaluecoll =sınıflistMap.values();//map den collectıon attık
        System.out.println(sınıfvaluecoll);//[ali,can,dev, veli,yan,qa, ali,yan,dev]elimde şu an bie collectıon var ben bunlara ındex ile
        //ulaşmama lazım
        List<String>sınıfvaluelist=new ArrayList<>();//ilk önce list e koyduk sonra arraye koyavagız
        sınıfvaluelist.addAll(sınıfvaluecoll);//collectıon ı şimdi liste ekledik
        System.out.println(sınıfvaluelist);


        //her bir value birden fazla bilgiyi içeriyor onun için value leri çift katlı arraye atmak mantıklı duruyor anacak bunun
        //içinde boyutlara ihtiyacım var
        int outerarrayboyut=sınıfvaluelist.size();
        System.out.println(outerarrayboyut);//3

        //inner arraylerin boyutunu bulmak biraz daha copmlex
        String ilkvalue=sınıfvaluelist.get(0);//ilk value yi getirecek
        System.out.println(ilkvalue);//ali, can, dev ilk degeri yazdırdık bu bir string şimdi stringi arraye çevirecegiz
        //onun içinde split kullanıyoruz
        String ilkvalueArray[]=ilkvalue.split(", ");//arraye çevirdim
        int innerArrayboyut=ilkvalueArray.length;//inner arreyın boyutuna sahibim artık


        String valueMDarr[][]=new String[outerarrayboyut][innerArrayboyut];
        for (int i = 0; i <outerarrayboyut ; i++) {
            String temp[]=sınıfvaluelist.get(i).split(", ");//temp bir arraye atıyorum string arraye çevirdim
            for (int j = 0; j <innerArrayboyut ; j++) {

                valueMDarr[i][j]=temp[j];//
            }
        }
        System.out.println(Arrays.deepToString(valueMDarr));//[[ali,can,dev], [veli,yan,qa], [ali,yan,dev]]
        //bu satıra kadar :key leri index ile ulaşabildigimiz keylist e atadım
        //value leri valueMDarray e atadım
        //şimdi bu key ve value leri istedigim gibi manipule edebilirim
        System.out.println("numara isim soyisim Branş");
        System.out.println("=============================");
        for (int i = 0; i < keylist.size() ; i++) { //ilk önce key leri yani anahtar ımızı yazdırıyoruz
            System.out.print(keylist.get(i) + "   ");
            for (int j = 0; j <innerArrayboyut ; j++) {//şimdide value leri yani degerleri yazdırıyorum
                System.out.print(valueMDarr[i][j] + "   ");
            }
            System.out.println("");

        }






        }
    }

