package Day06_İfstatements;

import java.util.Scanner;

public class C13_İfstatementsödev {
    public static void main(String[] args) {
        //soru 5 kullanıcıdan gün ismini yazmasını isteyiniz geçerli gün ise ilk harfleri1,2,3 büyük
        //diger ikisini küçük olarak yazdırın gün ismi geçerli degilse geçerli gün ismi giriniz yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismini giriniz");
        String günİsmi= scan.next().toLowerCase();

        if (günİsmi.equals("pazartesi") || günİsmi.equals("salı") || günİsmi.equals("carsamba") ||
                günİsmi.equals("perşembe") || günİsmi.equals("cuma") || günİsmi.equals("cumartesi") ||
                günİsmi.equals("pazar")){
            System.out.println(günİsmi.toUpperCase().charAt(0) +" " + günİsmi.toUpperCase().charAt(1) +
                    " " + günİsmi.toUpperCase().charAt(2));


        }else {
            System.out.println("geçerli gün ismi giriniz");

        }

    }
}
