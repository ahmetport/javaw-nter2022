package Day11_Stringmanıpulatıon;

import java.util.Locale;
import java.util.Scanner;

public class C04_Length {
    public static void main(String[] args) {
        //kullanıcıdan ismini alıp baş harfini ve son harfını büyük harflerle yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("ilk harf :" +isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf:" +isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));



    }
}
