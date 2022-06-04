package Day40_Overriding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;


public class C05 {
    //KULLANICIDAN istedigi kadarsayı alıp toplayan bir program yazınız kullanıcı bitirmek isteginde q basmalıdır
//toplam 500 geçerse programı bitirsin veya kullanıcı bitirmek istediginde q bassın
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int toplam=0;
        do{
            System.out.println("sayıları giriniz\n bitirmek için q basınız");
            int sayı= 0;



            try {
                sayı = scan.nextInt();
                toplam+=sayı;
            } catch (InputMismatchException e) {
                String hatalıgiriş = scan.next();
                if (hatalıgiriş.equalsIgnoreCase("q")) {
                    System.out.println("girdiginiz sayıların toplamı :" + toplam);
                    break;
                } else {
                    System.out.println("hatalı giriş");

                }

            }


        }while(toplam<500);


    }
}
//int sayı verdik ama bitirmek için q ya basın dedik hata verecek exceptıon fırlatacak