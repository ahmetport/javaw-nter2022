package Day10_Swıtchandstrıng;

import java.util.Scanner;

public class C01_Swıtch {
    public static void main(String[] args) {

        //kullanıcıdan sayı alarak kaçıncı ay oldugunu alıp
        //istenen ay ismini yazdıran bir program yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kaçıncı ay oldugunu gırınız");
        int ayNo=scan.nextInt();

        switch (ayNo){
            case 1:
                System.out.println("ocak");//swıtch içine yazılan varıablenın degerine göre ilgili case bulur
                break;
            case 2:                        //eger break yoksa ilgili caseden asagı dogru tum caseler çalısır
                System.out.println("subat");
                break;
            case 3:

                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;

            case 6:
                System.out.println("hazıran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
                default:
                    System.out.println("lütfen geçerli bir ay numarası giriniz");




        }



    }
}
