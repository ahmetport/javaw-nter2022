package Day09_Ternaryswıtch;

import java.util.Scanner;

public class C01_Nestedifelse {
    public static void main(String[] args) {

        //kullanıcıdan dört basamaklı bir sayı girmesini isteyin
        //girdiginiz sayı 5 bölünüyorsa son rakamını kontrol edin
        //son rakamı 0 ise ekrana 5 bölünen çift sayı yazdırın son rakam 0 degilse 5 bölünen tek sayı yazdırın
        //girdiginiz password 5 bölünmüyorsa ekrana tekrar deneyin yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen dört basamaklı bir tam sayı giriniz");
        int sayı= scanner.nextInt();


        if (sayı<1000 || sayı>9999) {//istenmeyen durumu yazıyoruz
            System.out.println("lütfen dört basamaklı bir sayı giriniz");

        } else if (sayı%5==0 ) {//4 basamaklı ve sayı 5 e tam bölünüyor
            if (sayı % 10 == 0) {//4 basamaklı 5 ile bölünebilen ve son rakamı 0 olan
                System.out.println("5 e bölünen çift sayıdır");

            } else {// 4 basamaklı 5 ile bölünebilen ve son rakamı 0 olmayan
                System.out.println("5 e bölünebilen tek sayı");

            }
        }else{
            System.out.println("hatalı giriş");

        }











            }

            }







