package Day41_exceptıon;

import java.util.Scanner;

public class C03_İllegalexceptıon {
    public static void main(String[] args) {
        //kullanıcıdan yaşını isteyin kullanıcı yaş olarak negatif bir sayı 0 veya 120 den büyük bir sayı girerese
        //illegalargumentexceptıon oluşacak şekilde program yazınız
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas=scan.nextInt();

        if(yas<=0||yas>120){
           // System.out.println("geçerli bir yaş giriniz");
            //java bizimistedigimiz durumlarda exceptıon fırlatabilir
            throw new IllegalArgumentException();
        }else{
            System.out.println("teşekkürler");
        }

    }
}
