package Day09_Ternaryswıtch;

import java.util.Scanner;

public class C10_Dikdörtgensorusu {
    public static void main(String[] args) {

        //kullanıcıdan dikdörtgenin uzunlugunu ve genişligini alın girilen degerlere göre
        //dikdörtgenin kare olup olamadıgını yazdırın
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin uzunlugunun ve genişligini giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();

        String sonuc=(kenar1==kenar2 ? "karedir" :"kare degildir");//basit sonuc gerektiren problemler ternary ile çözülür
        System.out.println(sonuc);

    }
}
