package Day09_Ternaryswıtch;

import java.util.Scanner;

public class C09_Artıkyılsorusu {
    public static void main(String[] args) {

        //kullanıcıdan artık yıl olup olmadıgını görmek için yıl girmesini isteyin
        //kural1:4 ile bölünemeyen yıl artık yıl değildir
        //kural2:4 un katı olmasına ragmen 100 ile bölünebilen yıllardan sadece 400 katı olan yıllar artık yıldır

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir yıl giriniz");
        int yıl = scan.nextInt();

        if (yıl%4==0 && yıl%100!=0){
            System.out.println("artık yıl");

        }else if (yıl%100==0 && yıl%400==0){
            System.out.println("artık yıl");


        }else {
            System.out.println("artık yıl degil");

        }
    }
}
