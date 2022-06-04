package Day13_StrıngManıpulatıon;

import java.util.Scanner;

public class C03_soru3 {
    public static void main(String[] args) {
        //kullanıcıdan isim isteyin.eger
        //isim "a" harfi içeriyorsa "girdiginiz isim a harfi içeriyor"yazdırın
        //isim "Z   harfi içeriyorsa "girdiginiz isim Z harfi içeriyor
        //ikiside yoksa "girdiginiz isim a veya z harfi içermiyor" yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String str=scan.next();

        if(str.contains("a")){
            System.out.println("girdiginiz isim a harfi içeriyor");
        }else if(str.contains("Z")){
            System.out.println("girdiginiz isim Z harfi içeriyor");
        }else{
            System.out.println("girdiginiz isim a ve Z harfi içermiyor");

        }
    }
}
