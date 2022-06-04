package Day06_İfstatements;

import java.util.Scanner;

public class C05_İfelsehaftanıngünleri {
    public static void main(String[] args) {
     //kullanıcıdan gün ismi alınız haftasonu veya hafta içi olarak yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen günismini giriniz");
        String günİsmi=scan.next().toUpperCase();

        if (günİsmi.equals("PAZAR") || günİsmi.equals("CUMARTESİ")) {
            System.out.println("girdiginiz gün haftasonu");
        } else {
            System.out.println("girdiginiz güm haftaiçi");



        }


    }
}
