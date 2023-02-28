package Day06_İfstatements;

import java.util.Scanner;

public class C04_Haftaiçisorusu {
    public static void main(String[] args) {
        //kullanıcıdan gün ismini alın ve haftaiçi veya haftasonu oldugunu yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen  günismi yazınız");
        String günIsmi = scan.next().toUpperCase();//kullanıcı nasıl yazarsa yazsın biz küçük harfe ceviriyoruz

        if (günIsmi.equals("PAZAR") || günIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gün haftasonu");
        }


        if (günIsmi.equals("pazartesi") || günIsmi.equals("salı") ||
                günIsmi.equals("ÇARŞAMBA") || günIsmi.equals("perşembe") || günIsmi.equals("cuma")) {
            System.out.println("girdiginizgün haftaiçi");
        }

    }

}


















