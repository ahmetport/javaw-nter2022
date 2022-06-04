package Day36_Inherıtance;

public class muhasebe extends personel{
    protected int saatücreti;
    protected String statu;
    protected int maaş;


    protected int maaşhesapla(){
        int maaş=saatücreti*8*30;
        return maaş;
    }

}
