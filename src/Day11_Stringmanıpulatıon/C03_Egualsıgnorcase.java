package Day11_Stringmanıpulatıon;

import java.util.Scanner;

public class C03_Egualsıgnorcase {
    public static void main(String[] args) {

        //kullanıcıya derse katılıp katılmak istemedigini sorun evet derse katılımınız alınmıştır yazdırın
        //hayır derse cevabını ve sonraki derslere bekleriz yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("derse katılmak istermisiniz ? \n evet veya hayır yazınız");
        String cevap=scan.next();

        if(cevap.equalsIgnoreCase("evet")) {
            System.out.println("cevabınız :" + cevap +  "derse katılımınız onaylanmıştır");
        }else if(cevap.equalsIgnoreCase("hayır")) {
            System.out.println("cevabınız :" + cevap + "sonraki derslerimize bekleriz");
        }else{
            System.out.println("evet veya hayır yazınız");//IGNORCASE kullanırsak kullanıcının verdigi cevap aynı şekilde çikar
            //yani kullanıcının cevabını degiştirmemiş oluruz uppercase ve lovercase de çevirdigimiz için
            //bu daha kullanişlı örnek şifre sorsak sıkıntı olur

        }

    }
}
