package Day38_Inherıtance_overriding;

public class Personel {
   public String statu="personel";
   public String haklar="tüm personel eşit haklara sahiptir";
   public String izin="tüm personel yılda 4 kez izin kulllanabilir";

    public void mesai(){
        System.out.println("tüm personel 5 gün, gunde 8 saat çalişir");

    }
    public void maashesapla(){
        System.out.println("tüm personel 30 gün*8 saat*10£=" +(30*8*10)+"euro maaş alır");
    }
}
