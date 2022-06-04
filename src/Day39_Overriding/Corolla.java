package Day39_Overriding;

public class Corolla extends Toyota {

    protected String hız="corolla max 200 km hız yapar";
    protected String yakıt="corolla benzinli veya elektriklidir";
    protected String model="corolla";



    public void motor(){
        System.out.println("corolla araçlar çevreci  motor kullanılırlar");

    }

    public void yakıttüketimi() {
        System.out.println("corolla 5.6 litre yakıt tüketir");
    }
    public void vitessayısı(){
        System.out.println("corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        //data türü ve constructur faklı oldugundan cons çaliştıgı için obje constructurun
        //oldugu class özelliklerini taşır ancak data türü parent class seçildigi için
        //variabler lar data türünün seçildigi class ve onun parent classlarından deger alabilir

        //methodlar için ise yine data türünün oldugu classa gideriz ancak direk methodu çalıştırmadan
        //önce method overriding edlmişmi kontrol ederiz

        Corolla arb1= new Corolla();
        System.out.println(arb1.hareket);//araba
        System.out.println(arb1.hız);//corolla
        System.out.println(arb1.yakıt);//corolla
        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.şirketmerkezi);//toyota
        System.out.println(arb1.model);//corolla
        arb1.motor();//corolla

        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket);//araba
        System.out.println(arb2.hız);//toyota
        System.out.println(arb2.yakıt);//araba
        System.out.println(arb2.marka);//toyota
        System.out.println(arb2.şirketmerkezi);//toyata
       // System.out.println(arb2.model);//CTE verir
        arb2.motor();

        Araba arb3=new Corolla();
        System.out.println(arb3.hareket);//araba
        System.out.println(arb3.hız);//araba
        System.out.println(arb3.yakıt);//araba
        System.out.println(arb3.marka);//araba
        //System.out.println(arb3.şirketmerkezi);//CTE verir
         //System.out.println(arb3.model);//CTE verir

    }

}
