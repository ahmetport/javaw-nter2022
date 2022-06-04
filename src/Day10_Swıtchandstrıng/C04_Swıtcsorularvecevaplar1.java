package Day10_Swıtchandstrıng;

import java.util.Scanner;

public class C04_Swıtcsorularvecevaplar1 {
    public static void main(String[] args) {
        //kullanıcıdan haftanın kacıncı gunu oldugunu sorun ve gun ismını yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kaçıncı gün oldugunu giriniz");
        int günno=scan.nextInt();

        switch (günno){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
            case 7:
                System.out.println("pazar");
                break;

            default:
                System.out.println("hatalı gün girdiniz");

        }

    }
}
