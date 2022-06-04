package Day09_Ternaryswıtch;

import java.util.Scanner;

public class C08_Ternarysorular {
    public static void main(String[] args) {
        //kullanıcıdan bir harf isteyin küçük harf ise konsola"küçük harf"
        //büyük harf ise konsola"büyük harf" yoksa "girdiginiz karakter harf degil" yazdırın

        Scanner sacn= new Scanner(System.in);
        System.out.println("bir harf girin");
        char harf=sacn.next().charAt(0);
        int ASCIIharf=harf;

        String sonuc=(ASCIIharf>=65 && ASCIIharf<=90) ? "büyük harf"
               : (ASCIIharf>=97 && ASCIIharf<=122) ? "küçük harf" : "girdiginiz karakter harf degil";

        System.out.println(sonuc);





    }
}
