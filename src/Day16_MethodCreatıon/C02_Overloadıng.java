package Day16_MethodCreatıon;

public class C02_Overloadıng {
    public static void main(String[] args) {


        //verilen iki sayıyı toplyın ve yazdırın
        int sayı1=10;
        int sayı2=20;
        ikisayıdegeri(sayı1,sayı2);

        //iki double sayının toplamını yazdıran method oluşturalım
        double sayı3=15.2;
        double sayı4=10.3;
        ikisayıdegeri(sayı3,sayı4);

       //eger variable oluşturmadan direk sayıları yazarak method call yaparsam
        ikisayıdegeri(15,25);//ınteger toplamı verir double seçmeme ragmen
        ikisayıdegeri(10.1,12.3);//double toplamı verir ınteger seçmeme ragmen

        //bir integer ile bir double toplamını yazdıran bir metod oluşturalım
        int sayı5=3;
        double sayı6=3.2;
        ikisayıdegeri(sayı5,sayı6);//java overloadıng de ilk buldugunu degil en optımal olanı seçer


    }

    private static void ikisayıdegeri(double sayı3, double sayı4) {
        System.out.println("iki double toplamı:" + (sayı3+sayı4));

    }

    private static void ikisayıdegeri(int sayı1, int sayı2) {
        System.out.println("girilen iki integer toplamı:" + (sayı1+sayı2));

    }


}


