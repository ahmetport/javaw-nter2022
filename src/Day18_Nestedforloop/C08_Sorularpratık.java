package Day18_Nestedforloop;

import java.util.Random;
import java.util.Scanner;

public class C08_Sorularpratık {
    public static void main(String[] args) {

        //bilgisayara 1 ile yüz arasında bır sayı tutturun
        //kullanıcıdan bu sayıyı tahmın etmesini isteyın
       // girilen her tahmınde sayıyı buyut veya kuçult dıye kullanıcıya yol gösterinite
       //kullanıcı sayıyı buldugunda kaç tahmınde sayıyı buldugunu kullanıcıya yazdırın
        Scanner scan=new Scanner(System.in);
       Random rnd=new Random();
       int sayı= rnd.nextInt(100);//burası 100 den küçük rastgele bir sayı oluşturur
        int tahmin=0;
        int sayac=1;
        while (tahmin!=sayı){
            System.out.println("lütfen sayı giriniz");
            tahmin= scan.nextInt();

            if(tahmin<sayı){
                System.out.println("daha büyük bir sayı giriniz");


            }else if(tahmin>sayı){
                System.out.println("küçük bir sayı giriniz");
            }
            sayac++;
        }
        System.out.println("tuttugum sayıyı" +(sayac-1) +"tahminde bulundunuz");






            }
        }






