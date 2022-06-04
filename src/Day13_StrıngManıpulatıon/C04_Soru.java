package Day13_StrıngManıpulatıon;

import java.util.Scanner;

public class C04_Soru {
    public static void main(String[] args) {
        //kullanıcıdan isim ve soy isim isteyin hangisinib daha uzun oldugunu yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen isminizi giriniz");
        String name=scan.next();
        System.out.print("lütfen soyisminizi giriniz");
        String surname=scan.next();

        System.out.println(name.length()> surname.length() ? "isminiz daha uzun": "soyisminiz daha uzun");

    }
}
