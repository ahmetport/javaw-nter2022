package Day36_Inherıtance;

public class sürekliişçiler extends işçi {

    public static void main(String[] args) {
        sürekliişçiler suriç1 = new sürekliişçiler();
        suriç1.personeNo = 5001;
        suriç1.isim = "cem";
        suriç1.soyisim = "akay";
        suriç1.saatücreti = 11;
        suriç1.statu = "işçi";
        suriç1.maaş = suriç1.maaşhesapla();
        System.out.println(suriç1);


    }
    @Override
    public String toString() {
        return "sürekliişçiler{" +
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

