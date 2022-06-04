package Day15_methodCreatıon;

public abstract class C04 {
    //MAİN METHOD OLMADAN BİR CLASS OLUŞTURULABİLİR ancak bu class çalışmaz sadece depo görevi görür

    public static void dörtharfitersineçevir(String kelime) {
        String terskelime = kelime.substring(3) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayısı: 4");
        System.out.println("kelimenin tersten yazılışı:" + terskelime);
    }

    public static void üçharfitersineçevir(String kelime) {
        String terskelime = kelime.substring(2) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayısı: 3");
        System.out.println("kelimenin tersten yazılışı:" + terskelime);
    }

    /*
      class'imizi bir abstract class'in child class'i olarak
      belirtmek istersek
      Java hemen class isminin altini kirmizi cizer
      bizden
      child class'i abstract yapmamizi veya parent class'daki abstract
      method'lari override etmemizi ister
      parent olan abstract class'daki concrete method'lar ise opsiyoneldir
      onlari istersek override ederiz, istemezsek override etmeyiz
       */
    public abstract void absMethod();
}
