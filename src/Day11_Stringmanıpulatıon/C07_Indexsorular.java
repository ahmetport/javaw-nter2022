package Day11_Stringmanıpulatıon;

import java.util.Scanner;

public class C07_Indexsorular {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle=scan.nextLine();
        System.out.println("lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        if(cümle.indexOf(harf)==(-1)){
            System.out.println("cümlenin içinde harf yoktur");

        }else{
            System.out.println("cümlenin içinde harf vardır");





        }


    }
}
