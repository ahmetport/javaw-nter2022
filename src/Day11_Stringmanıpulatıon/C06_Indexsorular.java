package Day11_Stringmanıpulatıon;

import java.util.Scanner;

public class C06_Indexsorular {
    public static void main(String[] args) {
        //kullanıcıdan maıl adresini isteyin @ varsa mailiniz geçerlidir yazdırın yoksa geçersiz yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen mailinizi yazdırın");
        String mail = scan.nextLine();

        if (mail.indexOf("@") == (-1)) {
            System.out.println("geçersiz");
        } else {
            System.out.println("geçerli");


        }


    }
}