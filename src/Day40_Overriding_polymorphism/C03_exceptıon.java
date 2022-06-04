package Day40_Overriding_polymorphism;

import java.util.Scanner;

public class C03_exceptıon {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı alıp bölerek sonucu yazdıran bir program yazınız
        Scanner scan=new Scanner(System.in);
        int kontrol=0;
        while(kontrol!=1){

            System.out.println("bölmek istediginiz sayıyı giriniz");
            int sayı1 = scan.nextInt();
            int sayı2 = scan.nextInt();
            try {
                System.out.println("sonuç=" +sayı1/sayı2);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("devam etmek için 1\n bitirmek için 2 ye basın");


        }
        System.out.println("bölmek istediginiz sayıyı giriniz");
        int sayı1 = scan.nextInt();

        System.out.println("bölmek istediginiz sayıyı giriniz");
        int sayı2 = scan.nextInt();

        System.out.println("sonuç=" +sayı1/sayı2);
        //sayı2 0 oldugunda sayı tanımsız olacagından java exceptıon fırlatır
       // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at Day40_Overriding_polymorphism.C03_exceptıon.main(C03_exceptıon.java:14)
    }

}
