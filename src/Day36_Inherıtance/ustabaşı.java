package Day36_Inherıtance;

public class ustabaşı extends işçi{
    public static void main(String[] args) {
        ustabaşı ustabaşı = new ustabaşı();
        ustabaşı.saatücreti=15;
        ustabaşı.isim="ahmet";
        ustabaşı.soyisim="porti";
        ustabaşı.maaş=ustabaşı.maaşhesapla();
        ustabaşı.statu="işçi";
        System.out.println(ustabaşı);
    }


    @Override
    public String toString() {
        return "ustabaşı{" +
                "işçistatu='" + işçistatu + '\'' +
                ", saatücreti=" + saatücreti +
                ", statu='" + statu + '\'' +
                ", maaş=" + maaş +
                ", personeNo=" + personeNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}




