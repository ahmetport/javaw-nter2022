package Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda04 {

    /*
    TASK :
    fields --> Universite (String)
               bolum (String)
               ogrcSayisi (int)
               notOrt (int)
               olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
     */
    public static void main(String[] args) {

        Universite bogazici = new Universite("bogazici", "matematik", 571, 93);
        Universite itu = new Universite("istanbul teknik", "matematik", 622, 81);
        Universite istanbul = new Universite("istanbul", "hukuk", 1453, 71);
        Universite marmara = new Universite("marmara", "bilgisayar muh", 1071, 77);
        Universite ytu = new Universite("yıldız teknik", "gemi", 333, 74);
        List<Universite> unv = new ArrayList<>(Arrays.asList(bogazici, itu, istanbul, marmara, ytu));

        System.out.println(notOrt74BykUnv(unv));
        System.out.println(" ********    ");
        System.out.println(  ogrnsayısı110azOlmadigini(unv)  );
        System.out.println(" ********    ");
        System.out.println(matbolumvarmı(unv));
        System.out.println(" ********    ");
        System.out.println(  ogrencisayıları(unv)  );
        System.out.println(" ********    ");
        notortgörebykkçgilküçsırala(unv);
        System.out.println(" ********    ");
        ogrsayenazolan2unv(unv);
        System.out.println(" ********    ");
        notort63denbykolanunv( unv);
        System.out.println(" ********    ");
        ogrncsayısı333danbykolanunvnotort( unv);
        System.out.println(" ********    ");
        matsayısı( unv);
        System.out.println(" ********    ");
        ogrcsay571fazlaolanenbyknotort( unv);
        System.out.println(" ********    ");
        ogrcsay1071azolanenkçknotort(unv);


    }

    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
public static boolean notOrt74BykUnv(List<Universite> unv ){

        return  unv.
                stream().
                allMatch(t->t.getNotOrt()>74);
}
     //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
    public static boolean ogrnsayısı110azOlmadigini(List<Universite>unv){
       return unv.stream()
               .allMatch(t->t.getOgrSayisi()>110);
    }


    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean matbolumvarmı(List<Universite>unv){
     return   unv.stream().
             anyMatch(t->t.getBolum().contains("mat"));
    }


    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public  static List<Universite>  ogrencisayıları(List<Universite>unv){
      return  unv.
              stream().
              sorted(Comparator.comparing(Universite::getOgrSayisi).reversed()).
              collect(Collectors.toList());//akıştaki elemanı istenen şarta göre toplar liste göre toplar list yapmamımızın sebebi kolay
        //yazdırmamız.list oldugu için toarray yapmamıza gerek yok voidlede yapabilirdik return kaldırır burda sout ile yazdırırdık
    }


    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    public static void notortgörebykkçgilküçsırala(List<Universite>unv){
        System.out.println(unv.stream().
                sorted(Comparator.comparing(Universite::getNotOrt).reversed()).
                limit(3).
                collect(Collectors.toList()));
    }


    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
    public static void ogrsayenazolan2unv(List<Universite>unv){
        System.out.println( unv.stream().
                sorted(Comparator.comparing(Universite::getOgrSayisi)).
                limit(2).
                skip(1).
                collect(Collectors.toList()));
    }


    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz
    public static void notort63denbykolanunv(List<Universite> unv){
        System.out.println(unv.stream().
                filter(t->t.getNotOrt()>63).
                mapToInt(Universite::getOgrSayisi).sum());//maptoınt methodu ıle ınt çevirip akış elemanlarını optımal olmadan topluyoruz
             // reduce(Integer::sum);
             // reduce(Math::addExact); üç şekildede toplama yapılır ama en basit ve sadesi maptoınt kullanmak
             // reduce(0,(t,u)->t+u);
    }


    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static void ogrncsayısı333danbykolanunvnotort(List<Universite> unv){
        System.out.println( unv.stream().
                filter(t->t.getOgrSayisi()>333).
                mapToDouble(Universite::getNotOrt).//maptoınt methodu ıle double çevirip akış elemanlarını optımal olmadan topluyoruz
                average());
    }
    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.
    public static void matsayısı(List<Universite> unv){
        System.out.println(unv.stream().
                filter(t->t.getBolum().
                        equalsIgnoreCase("matematik")).count()); //yazdırır
         //return edecegimiz zaman void long yapmamız lazın yada cast yapacagız ınt count long dan gelmektedir
    }
    //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz
    public static void ogrcsay571fazlaolanenbyknotort(List<Universite> unv) {
        System.out.println(unv.stream().
                filter(t->t.getOgrSayisi()>571).
                mapToInt(t->t.getNotOrt()).max());
    }
    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static void ogrcsay1071azolanenkçknotort(List<Universite> unv){
        System.out.println(unv.stream().
                filter(t->t.getOgrSayisi()<1071).
                mapToInt(t->t.getNotOrt()).min());


    }



}





























