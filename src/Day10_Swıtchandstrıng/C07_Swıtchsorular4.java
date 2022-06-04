package Day10_Swıtchandstrıng;

import java.util.Scanner;

public class C07_Swıtchsorular4 {
    public static void main(String[] args) {

        //kullanıcıdan SDET KISALTMASINDAKİ HARFLERDEN BİRİNİ İSTEYİN
        //kullanıcı s girerse "Software"
        //kullanıcıd girerse"Developer"
        //kullanıcı e girerse "Engıneer"
        //kullanıcı t girerse "Testıng" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen SDET harflarinden birini giriniz");
        char harf=scan.next().toUpperCase().charAt(0);
        switch(harf){
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("engıneer");
                break;
            case 'T':
                System.out.println("Testıng");
                break;
            default:
                System.out.println("yanlış giriş yaptınız");



        }


    }
}
