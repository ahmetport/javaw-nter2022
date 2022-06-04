package Day43_garbagecollector_abstrackclass;

public class C01_Final {

    final static double piSayisi= 3.14;//hiç degiştirilmeyecekleri böyle ataya biliriz
    final static String okulIsmi="Yildiz koleji";//static ile heryere ulaşabiliriz ama final deger ataması yaptırmaz korur
    public static void main(String[] args) {
        final int sayi=10;
       // sayı=20; yeni deger atayamazsın çünkü degerin son hali 10 dur yani final
        // okulIsmi="Java Koleji";  final olarak isaretlendigi icin degistirilemez
    }
    public final static  void method1(){
        System.out.println("Parent class final method1");
    }
}


