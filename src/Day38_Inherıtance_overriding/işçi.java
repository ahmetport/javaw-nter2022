package Day38_Inherıtance_overriding;

public class işçi extends Personel{
    public String statu="işçi";
    public String haklar="işçiler kıdem tazminatı alırlar";
     public String ikramiye="işçiler yılda bir kez ikramiye alırlar";

    public void mesai(){
        System.out.println("tüm işçiler haftalık 40 saat çalışır ");

    }
    public void maashesapla(){
        System.out.println("tüm personel 30 gün*8 saat*11£=" +(30*8*11)+"euro maaş alır");
    }
}

