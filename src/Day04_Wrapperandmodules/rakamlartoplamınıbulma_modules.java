package Day04_Wrapperandmodules;

import java.util.Scanner;

public class rakamlartoplamınıbulma_modules {

    public static void main(String[] args) {
        //kullanıcıdan bi tane 4 basamaklı sayı isteyin ve o sayının basamaklarının rakamlar degerini bulunuz


        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen dört basamaklı bir tam sayı giriniz");
        int sayı= scan.nextInt();

        int rakam=0;
        int rakamlarlartoplamı=0;

       rakam=sayı%10;//2

        rakamlarlartoplamı+=rakam;
        sayı/=10;

        rakam=sayı%10;// 3 aldık

        rakamlarlartoplamı+=rakam;//5 basamaklartoplamına ekledik
        sayı/=10;//75 kaldı


        rakam=sayı%10;//5 i aldım
        rakamlarlartoplamı+=rakam;// 10 oldu      5 ide basamaklartoplamına ekledik
        sayı/=10;
       //dördüncü adım r=5 bt=10 sayı=7


        rakam=sayı%10;

        rakamlarlartoplamı+=rakam;
        sayı/=10;

        System.out.println("girdigimiz sayının rakamlar toplamı  " + rakamlarlartoplamı );














    }
}
