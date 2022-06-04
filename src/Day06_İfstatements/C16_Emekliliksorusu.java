package Day06_İfstatements;

import java.util.Scanner;

public class C16_Emekliliksorusu {
    public static void main(String[] args) {
        //kullanıcıdan maaş için bir teklif isteyin teklif 80000 üzerinde ise "kabul ediyorum"
        //60000 ile 80000 arasında ise "konuşabiliriz" 60000 altında ise "maalesef kabul edemem"

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir teklif giriniz");
        int teklif= scan.nextInt();

        if (teklif<60000 && teklif>=30000){
            System.out.println("maalesef kabul edemem");

        }else if (teklif>=60000 && teklif<80000){
            System.out.println("konuşabiliriz");

        }else if (teklif>=80000){
            System.out.println("kabul ediyorum");

        }else {
            System.out.println("galiba köle arıyorsunuz");
            System.out.println("ahmet hacı");



        }
    }
}
