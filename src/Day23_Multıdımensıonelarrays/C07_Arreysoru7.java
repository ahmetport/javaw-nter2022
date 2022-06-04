package Day23_Multıdımensıonelarrays;

import java.util.Scanner;

public class C07_Arreysoru7 {
    public static void main(String[] args) {
        //kullanıcıdan bir cümle isteyin ve cümledeki kelime sayısını yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle=scan.nextLine();

        String arr[]=cümle.split(" ");
        System.out.println("girdiginiz cümledeki kelime sayısı:" +arr.length);

    }
}
