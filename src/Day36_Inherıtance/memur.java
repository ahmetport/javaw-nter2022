package Day36_Inherıtance;

public class memur extends muhasebe {
    public static void main(String[] args) {
        memur memur1=new memur();
        //memur1 objesi memur classının objesi olmasına ragmen inharit ettigi muhasebe ve onunda parenti olan personel classını kullanır
        //personel classından
        memur1.personeNo=1001;
        memur1.isim="ahmet";
        memur1.soyisim="tepecik";
        memur1.adres="ankara";
        memur1.tel="3423253986";
        //muhasebe classından
        memur1.saatücreti=10;
        memur1.maaş=memur1.maaşhesapla();
        memur1.statu="memur";
        System.out.println(memur1);

        memur memur2=new memur();
        memur2.personeNo=1002;
        memur2.saatücreti=10;
        memur2.maaş=memur2.maaşhesapla();
        System.out.println(memur2);


    }

    @Override
    public String toString() { //generate dedik tostring methodu dedik özellikleri seçtik artık direk yazdırabiliriz
        return "memur{" +
                "saatücreti=" + saatücreti +
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
