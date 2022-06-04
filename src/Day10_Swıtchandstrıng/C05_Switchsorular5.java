package Day10_Swıtchandstrıng;

import java.util.Scanner;

public class C05_Switchsorular5 {
    public static void main(String[] args) {
        //kullanıcıdan gün ismini alıp haftaiçi veya hafta sonu yazdıralım

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismi giriniz");
        String günismi=scan.next();

        switch (günismi){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("hafta içi");
                break;
            case "cumartesi":
            case"pazar":
                System.out.println("hafta sonu");
                break;

             default:
                 System.out.println("hatalı giriş");



        }
    }
}
