package Day30_passbyvalue;

public class C04_Passbyvalue {
    // Kalici indirim icin ikinci yontem
    public static void main(String[] args) {
        double etiketFiyati=100;
        double indirimYuzdesi=10;
        etiketFiyati = kaliciIndirimYap(etiketFiyati,indirimYuzdesi);
        System.out.println("main method'da indirim sonrasi etiket fiyati : " + etiketFiyati);
    }
    public static double kaliciIndirimYap(double etiketFiyati,double indirimYuzdesi){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100 ;
        System.out.println("indirimli fiyat : " + etiketFiyati);
        return etiketFiyati;
    }
}


