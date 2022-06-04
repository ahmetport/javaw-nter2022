package Day12_Stringmanıpulotıon;

import java.util.Scanner;

public class C04_Replaceall {
    public static void main(String[] args) {
        //kullanıcıdan isim ve soy isim bilgisini alıp
        //bütün harfleri * yapalım

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isim ve soyisminizi giriniz");
        String isimSoyisim=scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S" ,"*"));//

    }
}
