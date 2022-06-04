package Day04_Wrapperandmodules;

public class C01_Wrapperclass {
    public static void main(String[] args) {

        short sayı1=10;
        Short sayı2=20;//wrapper class ile aynı isimdeki primitive geçiş yapılabilr
        sayı1=sayı2;
        System.out.println(sayı1);//20

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);//BÜYÜK HARF VE NOKTA ÖNEMLİ




    }
}
