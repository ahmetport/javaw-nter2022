package Day03_Scanner;

import java.util.Scanner;

public class C04_SoruveCevaplar {
    public static void main(String[] args) {
        //karenin bir kenar uzunlugunu alın alan ve çevresini hesaplayıp yazdırın

        Scanner scan=new Scanner(System.in);
       // System.out.println("karenin bir kenar uzunlugunu yazınız");
      //  double sayı1=scan.nextDouble();
      //  System.out.println("karenin çevresi:" +4*(sayı1));
      //  System.out.println("karenin alanı:" +(sayı1*sayı1));
        //kullanıcıdan yarı çap isteyin çemberin çevresini ve alanını hesaplayıp yazdırın

        System.out.println("çemberin yarıçapını giriniz");
        double yarıçap= scan.nextDouble();
        System.out.println("girdiginiz yarıçap:" +yarıçap);
        System.out.println("çemberin çevresi:" + 2*3.14*yarıçap);
        System.out.println("dairenin alanı:"+ 3.14*yarıçap*yarıçap);



    }
}
