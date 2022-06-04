package Day18_Nestedforloop;

import java.util.Scanner;

public class C07_Sorupratıkler {
    public static void main(String[] args) {
        //kullanıcıdan istedigi kadar sayı girmesını isteyın
        //kullanıcını girdigi sayıların toplamı 500 gecerse
        //artık yeter cok sayı girdin,toplam....oldu yazsın

        Scanner scan=new Scanner(System.in);
        int sayı=0;
        int toplam=0;
        while (toplam<500){
            System.out.println("sayı giriniz");
            sayı=scan.nextInt();
            toplam+=sayı;

        }
        System.out.println("artık yeter cok sayı girdin,toplam:" +toplam+"oldu");

    }
}
