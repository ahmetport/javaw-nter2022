package Day38_Inherıtance_overriding;

public class Ustabaşı extends işçi{

    public String statu="Ustabaşı";
    public String haklar="Usatbaşı haftada bir gün ekstra tatil hakkına sahiptir";


    public void mesai(){
        System.out.println("arıza varsa ustabaşı ekstra ücret almadan çalişir");

    }
    public void maashesapla(){
        System.out.println("ustabaşı 30 gün*8 saat*10£=" +(30*8*12)+"euro maaş alır");
    }

    public static void main(String[] args) {
        Ustabaşı yasin=new Ustabaşı();
        System.out.println(yasin.statu);//ilk önce bu classa bakacagız statu var mı diye
        System.out.println(yasin.haklar);//Usatbaşı haftada bir gün ekstra tatil hakkına sahiptir
        System.out.println(yasin.ikramiye);//işçiler yılda bir kez ikramiye alırlar
        System.out.println(yasin.izin);//tüm personel yılda 4 kez izin kulllanabilir
        yasin.maashesapla();//2880
        yasin.mesai();//arıza varsa ustabaşı ekstra ücret almadan çalişir


        işçi ahmet=new Ustabaşı();//class adının yerine data türünü işçi seçeriz artık ahmet işçi claassından
        System.out.println(ahmet.statu);//işçi
        System.out.println(ahmet.haklar);//işçiler kıdem tazminatı alırlar
        System.out.println(ahmet.ikramiye);//işçiler yılda bir kez ikramiye alırlar
        System.out.println(ahmet.izin);//tüm personel yılda 4 kez izin kulllanabilir
        ahmet.maashesapla();//2880
        ahmet.mesai();//arıza varsa ustabaşı ekstra ücret almadan çalişir


       //biz objeyi nerden hangi classdan tanımlarsak o class aait özelliklere sahip olur
        Personel adem=new Ustabaşı();//ademin data türü personeldir ama adem ustabaşıdır bu çok spesifik kullanımdır
        System.out.println(adem.statu);//personel
        System.out.println(adem.haklar);//tüm personel eşit haklara sahiptir
       // System.out.println(adem.ikramiye);cte verir personel classında ikramiye yok personel classı parent tir chıld yok
        System.out.println(adem.izin);//tüm personel yılda 4 kez izin kulllanabilir
        adem.maashesapla();//2880
        adem.mesai();//arıza varsa ustabaşı ekstra ücret almadan çalişir














    }

}

