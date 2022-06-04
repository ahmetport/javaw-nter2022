package Day03_Scanner;

import java.util.Scanner;

public class C06_Prizma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("dikdörtgenler prizmasının uzun kenarını yazınız");
        System.out.println("dikdörtgenler prizmasının kısa kenarını yazınız");
        System.out.println("dikdörtgenler prizmasının yüksekligini yazınız");
        double kısakenar= scan.nextDouble();
        double uzunkenar= scan.nextDouble();
        double yükseklik= scan.nextDouble();
        System.out.println("dikdörtgenler prizmasının hacmi="  +kısakenar*uzunkenar*yükseklik);

    }
}
