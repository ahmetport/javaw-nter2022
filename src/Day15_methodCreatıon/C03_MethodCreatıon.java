package Day15_methodCreatıon;

import java.util.Scanner;

public class C03_MethodCreatıon {
    public static void main(String[] args) {
        //kullanıcıdan bir kelime isteyin
        //eger kelime üç harften kısa ise "kelime çok kısa"yazdırın
        //eger kelime 3,4,veya 5 harfli ise harf sayısını ve kelimenin tersten yazılısını yazdırın
        //eger5 harften uzunsa "kelime çok uzun"yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime = scan.nextLine();
        int harfsayısı=kelime.length();

        if(harfsayısı<3){
            System.out.println("girdiginiz kelime kısa");

        }else if(harfsayısı==3){
            üçharfitersineçevir(kelime);
        }else if(harfsayısı==4){
            dörtharfitersineçevir(kelime);
        }else if(harfsayısı==5){
            beşharfitersineçevir(kelime);
        }else{
            System.out.println("girdiginiz kelime çok uzun");
        }


    }

    private static void beşharfitersineçevir(String kelime) {
        String terskelime = kelime.substring(4) + kelime.substring(3,4) + kelime.substring(2,3)+kelime.substring(1,2)
        +kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayısı: 5");
        System.out.println("kelimenin tersten yazılışı:" + terskelime);
    }

    private static void dörtharfitersineçevir(String kelime) {
        String terskelime = kelime.substring(3) + kelime.substring(2,3) + kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayısı: 4");
        System.out.println("kelimenin tersten yazılışı:" + terskelime);
    }

    private static void üçharfitersineçevir(String kelime) {
       String terskelime = kelime.substring(2) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayısı: 3");
        System.out.println("kelimenin tersten yazılışı:" + terskelime);
    }

}
