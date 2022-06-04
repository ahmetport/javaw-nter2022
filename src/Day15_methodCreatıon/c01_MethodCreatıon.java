package Day15_methodCreatıon;

import java.util.Scanner;

public class c01_MethodCreatıon {
    public static void main(String[] args) {

        //kullanıcıdan bir kelime isteyin
        //eger kelime üç harften kısa ise "kelime çok kısa"yazdırın
        //eger kelime 3,4,veya 5 harfli ise harf sayısını ve kelimenin tersten yazılısını yazdırın
        //eger5 harften uzunsa "kelime çok uzun"yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime = scan.nextLine();
        String terskelime = "";

        if (kelime.length() < 3) {
            System.out.println("kelime çok kısa");
        } else if (kelime.length() <= 5) {
            if (kelime.length() == 3) {
                terskelime=kelime.substring(2)+ kelime.substring(1,2) + kelime.substring(0,1);
            }else if(kelime.length()==4) {
                terskelime = kelime.substring(3) + kelime.substring(2, 3) + kelime.substring(1, 2) +
                        kelime.substring(0, 1);
            }else{
                terskelime=kelime.substring(4)+kelime.substring(3,4)+kelime.substring(2,3)+
                        kelime.substring(1,2)+kelime.substring(0,1);

            }
            System.out.println("girdiginiz kelimedeki harf sayısı:" +kelime.length());
            System.out.println("kelimenin tersten yazılışı:" + terskelime);

        }

    }
}
