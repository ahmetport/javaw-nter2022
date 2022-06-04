package Day06_İfstatements;

import java.util.Scanner;

public class C15_iFstatementsödevnotu {
    public static void main(String[] args) {
        //kullanıcıdan 100 üzerinden notunu isteyin notu harfe cevirip yazdırın
        //50 den küçükse "D",50-60 arası ise "C" 60-80 arası ise "B" 80 nin üzerinde ise "A"

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        int not1= scan.nextInt();

        if (not1<=50){
            System.out.println("aldıgınız not=  D");

        }else if (not1>=50 && not1<=60 ){
            System.out.println("aldıgınız not= C ");


        }else if (not1>=60 && not1<=80){
            System.out.println("aldıgınız not=  B");

        } else if (not1>=80) {
            System.out.println("aldıgınız not=  A");

        }else {
            System.out.println("hatalı not girdiniz");

        }
    }
}
