package Day19_Dowhıleloop;

public class
C01_Classdowhıleloop {
    public static void main(String[] args) {


        //kullanıcıdan bir sayı alın ve bu sayının rakamları toplamını yazdırın
        int input=145;
        int rakam=0;
        int rakamlartoplamı=0;

        while (input>0){
            rakam=input%10;//modules yapıp sayıyı böldüm
            rakamlartoplamı+=rakam;//aldıgım rakamı  rakamlar toplamına ekledim
            input/=10;//10 bölerek 9 kurtulduk
        }
        System.out.println(rakamlartoplamı);
    }
}
