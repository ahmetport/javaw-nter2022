package Day11_Stringmanıpulatıon;

import java.util.Locale;

public class C01_string {
    public static void main(String[] args) {
        //string methodlarını arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini küçük olarak yazdırın
        String str="JAVA Guzeldir";

        str.charAt(5);//böyle yazdıgımızda sonuç artık strıng degil char olacaktır
        System.out.println(str.toLowerCase().charAt(5));//strindeki yapmak istedigimiz degişiklikleri önce yapıp sonra char
                                                        //methodunu kullanacagız
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));//locale kullanınca turkçe yazdırabiliyoruz
        System.out.println(str.toLowerCase().charAt(1));


    }
}
