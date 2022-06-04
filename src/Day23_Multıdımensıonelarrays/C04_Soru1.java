package Day23_Multıdımensıonelarrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Soru1 {
    public static void main(String[] args) {
        //kullanıcıya kaç elementlık bir array oluşturacagını sorun arrayı oluşturup elementleri kullanıcıdan
        //alıp arraye atayın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kaç elementli array istediginizi yazın");

        int uzunluk=scan.nextInt();//mesela kullanıcı 5 yazarsa
        int arr[]=new int[uzunluk];//[0,0,0,0,0]

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("array için "+(i+1) +".  elemanı giriniz");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
