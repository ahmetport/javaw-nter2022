package Day03_Scanner;

import java.util.Scanner;

public class C03_Soruvecevaplar {
    public static void main(String[] args) {
        //iki tam sayının toplam çıkarma ve çarpımını yapınız

       // int sayı2=10;
        //int sayı3=20;
       // System.out.println("sayıların toplamı: "+   (sayı2+sayı3));
        //System.out.println("sayıların farkı: "+(sayı2-sayı3));
        //System.out.println("sayıların çarpımı: "+(sayı2*sayı3));
        //kullanıcıdan iki tam sayı alıp bu sayıları topla böl çarp

        Scanner scan=new Scanner(System.in);
        System.out.println("toplanacak sayıları giriniz");
        int rakam1= scan.nextInt();
        int rakam2= scan.nextInt();
        System.out.println("sayıların toplamı:" +(rakam1+rakam2));
        System.out.println("sayıların bölümü:" +(rakam1/rakam2));
        System.out.println("sayıların çarpımı:" +(rakam1*rakam2));














    }
}
