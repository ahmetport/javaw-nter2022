package Day06_İfstatements;

import java.util.Scanner;

public class C12_Harfıfstatements {
    public static void main(String[] args) {
        //kullanıcıdan bir karakter girmesini isteyiniz ve girilen karakterin harf olup olmadıgını yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("karakter giriniz");
        char karakter1=scan.next().charAt(0);

        if ((karakter1>= 'A' && karakter1<='Z') ||( karakter1>='a' && karakter1<='z')){

            System.out.println("girdiginiz karakter harftir");

        }else {
            System.out.println("girdiginiz karakter harf degildir");

        }






        }

    }

