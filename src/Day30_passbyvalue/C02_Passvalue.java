package Day30_passbyvalue;

public class C02_Passvalue {
    public static void main(String[] args) {
        double etiketfiyatı=100;
        yüzdeonindirimyap(etiketfiyatı); //orjinal etiket fiyatı
        yüzdeonindirimyap(etiketfiyatı);
        System.out.println("iki indirimden sonra main methodda etiket fiyatı:" +etiketfiyatı);
    }

    private static void yüzdeonindirimyap(double etiketfiyatı) {
        etiketfiyatı=etiketfiyatı*0.90;
        System.out.println("sizin için indirimli fiyatımız:" +etiketfiyatı); //kopya etiket fiyatı
    }


}

