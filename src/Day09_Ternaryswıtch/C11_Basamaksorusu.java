package Day09_Ternaryswıtch;

import java.util.Scanner;

public class C11_Basamaksorusu {
    public static void main(String[] args) {

        //kullanıcıdan bir sayı alın ve sayı 3 basamaklı ise"üç basamaklı sayı"yoksa "üç basamaklı degil yazdırın"

        Scanner scan=new Scanner(System.in);
        double sayı=scan.nextDouble();

        String sonuc=(sayı>99 && sayı<1000 ? "üç basamaklı sayı" : "üç basamaklı sayı degil");
        System.out.println(sonuc);

    }
}
