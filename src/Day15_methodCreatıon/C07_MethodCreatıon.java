package Day15_methodCreatıon;

public class C07_MethodCreatıon {
    public static void main(String[] args) {



        //string yazdıran method oluşturaklım,hoşgeldınız diyen bir method oluşturalım
        //kapanma mesajı yazan bir method oluşturalım
        hoşgeldınızyazdır();

    }
    public static void kapanmamethoduyazdırın() {
        System.out.println("bizi tercih ettiginiz için teşekkur ederiz");
    }

    public static void hoşgeldınızyazdır() {
        System.out.println("hoşgeldin");
        Stringyazdır("böylede olur");
    }

    public static void Stringyazdır(String str) {
        System.out.println(str);
        kapanmamethoduyazdırın();
    }
}
