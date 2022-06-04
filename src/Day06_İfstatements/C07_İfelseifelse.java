package Day06_İfstatements;

import java.util.Scanner;

public class C07_İfelseifelse {
    public static void main(String[] args) {
        //kullanıcıdan günismini alın haftaiçi veya haftasonu oldugunu yazdırın
        //eger kullanıcı gün ismini yanlış girerse hatalı giriş yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen günismini giriniz");
        String günİsmi= scan.next().toLowerCase();

        if (günİsmi.equals("pazar") || günİsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gün haftasonu");

        }else if (günİsmi.equals("pazartesi") || günİsmi.equals("salı") || günİsmi.equals("çarşamba") ||
                  günİsmi.equals("perşembe") || günİsmi.equals("cuma")){
            System.out.println("girdiginiz gün haftaiçi");

        }else {
            System.out.println("hatalı giriş yaptınız");//en kötü ihtimal en sondaki çalışır


        }






    }
}
