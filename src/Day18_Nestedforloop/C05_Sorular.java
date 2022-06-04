package Day18_Nestedforloop;

import java.util.Scanner;

public class C05_Sorular {
    public static void main(String[] args) {
        //kullanıcıdan kaç sayı toplamak istedigini alın,bu sayıların toplamını ekrana yazdırın

        int sayıadedi=3;
        Scanner scan=new Scanner(System.in);

       // int sayı=0;//varıable atamak için
       // int toplam=0;//forloop lu çözüm

       // for (int i = 1; i <=sayıadedi ; i++) {
         //   System.out.println("lütfen bir sayı giriniz");
           // sayı=scan.nextInt();
            //toplam+=sayı;
       // }
       // System.out.println("girilen" +sayıadedi+"sayının toplamı:" +toplam);
        //while ile yapalım
        int sayı=0;
        int toplam=0;
        int sayac=1;

        while (sayac<=sayıadedi){
            System.out.println("lütfen bir sayı giriniz");
            sayı=scan.nextInt();
            toplam+=sayı;
            sayac++;//whıle loop larda buraya bunu atamayı unutmayalım

        }
        System.out.println("girilen" +sayıadedi+"sayının toplamı:" +toplam);

    }






}
