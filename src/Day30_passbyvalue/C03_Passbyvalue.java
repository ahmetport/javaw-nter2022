package Day30_passbyvalue;

public class C03_Passbyvalue {
    //eger bir methodda yapılan degişikligin kalıcı olamasını istiyorsak iki yöntem kullanabiliriz
    //iki yöntem var
    //1-variable ı claas levelde static olarak oluşturabilirim

    static double etiketfiyatı;
    static double indirimyüzdesi;

    public static void main(String[] args) {
        etiketfiyatı=100;
        indirimyüzdesi=10;
        kalıcıindirimyap();
        kalıcıindirimyap();
        kalıcıindirimyap();

    }

    private static void kalıcıindirimyap() {

            etiketfiyatı=etiketfiyatı*(100-indirimyüzdesi)/100;
            System.out.println("indirimli fiyat:" +etiketfiyatı);
    }

}

