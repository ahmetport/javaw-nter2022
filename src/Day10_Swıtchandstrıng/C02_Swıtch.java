package Day10_Swıtchandstrıng;

import java.util.Scanner;

public class C02_Swıtch {
    public static void main(String[] args) {

        //kullanıcıdan kacinci ay oldugunu alıp mevsımleri yazdıran swıtch oluşturun
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kaçıncı ay oldugunu giriniz");
        int ayNo=scan.nextInt();
        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                System.out.println("kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("lutfen geçerli bir ay giriniz");


        }


    }
}
