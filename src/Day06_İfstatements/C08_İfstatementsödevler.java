package Day06_İfstatements;

import java.util.Scanner;

public class C08_İfstatementsödevler {
    public static void main(String[] args) {

        //kullanıcıdan gün isimlerinden birinin ilk harfini isteyiniz o harfle başlayan gün isimlerini yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün isimlerinden birinin ilk harfini giriniz");
        char ilkharf=scan.next().charAt(0);

        if (ilkharf=='p' || ilkharf =='P'){
            System.out.println("girdiginiz gün ismi pazar pazartesi veya perşembe olabilir");


        }



    }
}
