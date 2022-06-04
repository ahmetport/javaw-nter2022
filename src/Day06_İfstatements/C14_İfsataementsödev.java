package Day06_İfstatements;

import java.util.Scanner;

public class C14_İfsataementsödev {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin sayıların ikiside pozitif ise sayılaarın toplamını yazdırın
        //sayıların ikiside negatif ise sayıların çarpımını yazdırın sayıların ikisi farklı işretlere sahipse
        //"farklı işaretlerde sayılarla işlem yapamazsınız"yazdırın
        //sayılardan sıfıra eşit olan varsa"sıfır çarpmaya göre yutan elemandır" yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen iki sayı giriniz");
        double sayı1= scan.nextDouble();
        System.out.println("lütfen ikinci sayıyı giriniz");
        double sayı2= scan.nextDouble();


        if (sayı1>0 && sayı2>0 ){
            System.out.println(sayı1+sayı2);

        }else if (sayı1<0 && sayı2<0 ){
            System.out.println(sayı1*sayı2);

        }else if (sayı1<0 || sayı2>0){
            System.out.println("farklı işaretlerde sayılarla işlem yapamazsın");

        }else if (sayı1==0 || sayı2==0){
            System.out.println("sıfır çarpmaya göre yutan elemandır");


        }
    }
}
