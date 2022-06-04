package Day09_Ternaryswıtch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //ternary ile yapılan bütün işlemler if else lede yapılabilir ternary basitleştirir
        // kulanıcıdan bir tam sayı alın tek mi çift mi yazdıran bir kod alalım

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int sayı=scanner.nextInt();

        System.out.println(sayı%2==0 ? "sayı çift" : "sayı tek");



    }
}
