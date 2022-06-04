package Day06_İfstatements;

import java.util.Scanner;

public class C06_İfemeklilik {
    public static void main(String[] args) {

        //kullanıcıdan yaşını isteyin 65 den büyükse emekli olabilir
        //65 den küçükse emekli olamaz yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yaş= scan.nextInt();

        if (yaş>65){
            System.out.println("emekli olabilirsiniz");

        }else {
            System.out.println("emekli olamazsınız");
            System.out.println(65-yaş + "sene daha çalışmalısın");
            //if else de ikisiniinde çalışmama ihtimali yok sadece biri çalışacak
            //ikiside çalışamaz


        }
    }
}
