package Day26_Foreachloop_constructur;

public class Araba {
    //java da her claas oluşturdugumuzda  java o claasdan ileride objeler üretmek gerekecegini bilir ve biz özellikle
    //belirmesekte her oluşturdugu claasa constructor koyar.javanın claas oluştururken javaya koydugu consructor a
    //DEFAULT  constructor denir ve bu constructor görünmez eger biz görünür bir constructor olsun istersek default
    //constructor ile aynu-ı görevi yapan bir cons oluşturabiliriz.veya istersek aynı kalıptan farklı desenlerde objeler oluşturmak için farklı özellıklerde
    //cons oluşturabiliriz.cons ları birbirinden ayıran tek ayrıcalık kullanılan parametre  sayısı ve parametre data türüdür
    public Araba(){
        System.out.println("parametresiz cons çalıştı");
        //bir kod blogunun method veye cons olmasından emin olmak istiyorsanız iki şeye dikkar edecegiz
        //conslar ın ismi class ismi ile aynı olmak zorundadır yani büyük hrafle başlar
        //consların return type olmaz.
    }
}
