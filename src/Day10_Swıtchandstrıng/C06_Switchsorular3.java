package Day10_Swıtchandstrıng;

import java.util.Scanner;

public class C06_Switchsorular3 {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı girmesini isteyin
        //girilen sayı
        //10 ise iki basamaklı en küçük sayı 100 ise üç basamaklı en küçük sayı
        //1000 ise dört basamaklı en küçük sayı yazdırın
        //diger durumlarda girdigin sayı degişir yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayı=scan.nextInt();
        switch (sayı){
            case 10:
                System.out.println("iki basamaklı en küçük sayı");
                break;
            case 100:
                System.out.println("üç basamaklı en küçük sayı");
                break;
            case 1000:
                System.out.println("dört basamaklı en küçük sayı");
                break;

            default:
                System.out.println("girdigin sayı degişir");

        }
    }
}
