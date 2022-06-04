package Day24_Arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oguz");
        System.out.println(isimler);
        boolean sonuç = isimler.remove("oguz");//oguzu burdan siler
       // if (sonuç == true) {
           // System.out.println("istediginiz isim silidi");
       // } else {
          //  System.out.println("istediginiz isim listede olmadıgından silinemedi");


            //remove index yazdıgımızda sildim silmedim ihtımali kalmaz eger olmayan ındex yazdırırsan exceptıon olur
            //bize remove edilen elementi verir


            System.out.println( isimler.remove(1));//yusufu siler ve delil olarak yusufu ismini bize döndürür
           //yazdırsakta yazdırmasakta birinci sıradaki element silindi
            System.out.println(isimler);



        }
    }
