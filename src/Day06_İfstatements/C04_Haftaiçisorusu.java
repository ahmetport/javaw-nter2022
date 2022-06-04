package Day06_İfstatements;

import java.util.Scanner;

public class C04_Haftaiçisorusu {
    public static void main(String[] args) {
        //kullanıcıdan gün ismini alın ve haftaiçi veya haftasonu oldugunu yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen  günismi yazınız");
        String günİsmi = scan.next().toUpperCase();//kullanıcı nasıl yazarsa yazsın biz küçük harfe ceviriyoruz

        if (günİsmi.equals("PAZAR") || günİsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gün haftasonu");
        }


        if (günİsmi.equals("pazartesi") || günİsmi.equals("salı") ||
                günİsmi.equals("ÇARŞAMBA") || günİsmi.equals("perşembe") || günİsmi.equals("cuma")) {
            System.out.println("girdiginizgün haftaiçi");
        }

    }

}


















