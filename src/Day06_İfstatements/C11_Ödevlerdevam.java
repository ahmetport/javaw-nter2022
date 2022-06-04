package Day06_İfstatements;

import java.util.Scanner;

public class C11_Ödevlerdevam {
    public static void main(String[] args) {
        //kullanıcıdan bir karakter girmesini isteyin girilen karakterin harf olup olmadıgını yazdırın
        //kullanıcıdan bir üçgenin üçkenar uzunlugunu isteyin üç kenar birbirine eşit ise"eşkenar üçgen"
        //yazdırın degilse eşkenar degil yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen üçgenin üç kenar uzunlugunu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3) {
            System.out.println("eşkenar üçgendir");

        }   else {
            System.out.println("girilen üçgen eşkenar degildir");

        }
    }
}
