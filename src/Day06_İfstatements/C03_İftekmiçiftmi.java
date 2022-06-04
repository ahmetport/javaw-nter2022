package Day06_İfstatements;

import java.util.Scanner;

public class C03_İftekmiçiftmi {
    public static void main(String[] args) {
        //kullanıcıdan bir tamsayı isteyin ve sayının tek veya çift oldugunu yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bit tamsayı giriniz");
        int sayı = scan.nextInt();
        if (sayı % 2 == 0) {
            System.out.println("girilen sayı çift sayıdır");
        }


        if (sayı % 2 != 0) {
            System.out.println("girilen sayı tek sayıdır");
        }

        if (sayı%2==0){
            System.out.println("girdiginiz sayı çift satıdır");


        }else {
            System.out.println("girdiginiz sayı tek ");

        }
        }


    }





