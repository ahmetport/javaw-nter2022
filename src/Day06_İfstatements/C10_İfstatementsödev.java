package Day06_İfstatements;

import java.util.Scanner;

public class C10_İfstatementsödev {
    public static void main(String[] args) {

        //kullanıcıdan bir gün alın eger gün cuma ise "müslümanlar için kutsal gün"yazdırın
        //eger gün "cumartesi ise "yahudiler için kutsalgün yazdırın" eger pazar ise "hristiyanlar
        //için kutsal gün "yazdırın"

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün ismigiriniz");
        String günİsmi= scan.nextLine();

        if (günİsmi.equals("cuma")) {
            System.out.println("müslümanlar için kutsal gün");


        } else if(günİsmi.equals("cumartesi")) {
            System.out.println("yahudiler için kutsal gün");
        }else if(günİsmi.equals("pazar")) {
            System.out.println("hristiyanlar içim kutsal gün");
        }else {
            System.out.println("hatalı giriş");






            }


        }




    }

