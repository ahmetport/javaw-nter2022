package Day13_StrıngManıpulatıon;

public class C01_substrıng {
    public static void main(String[] args) {

        String str="java ile IT çok güzel";

        System.out.println(str.substring(5));// 5 den sonra hepsini yazdırır
        // yukardaki string i mehmet hoca ile IT çok güzel yazdıralım
        System.out.println(str.replaceAll("java", "mehmet hoca"));//böylede olur
        System.out.println("mehmet hoca" + str.substring(5));//böylede olur
        System.out.println(str.substring(9));//yazılan ındex ınclusıveşiyor

        //eger bir ındex den sona kadar olan parçayı degil belirli bir parçayı almak istersek
        //2 parametre yazarız substring başlangıç, bitiş yazılır
        //başlangıç index alınır son index alınmaz
        // bana 6 ınci harfi bulun char at method ıle string yapamayız
        String harf=str.substring(5,6);// 6 ıncı karakteri srting olarak  bulun altıncı harf ama 5 ınci index alınır
        System.out.println(harf);// i verir

        str="java gün geçtikçe güzelleşiyor";
        System.out.println(str.substring(7,7));//hiçlik verir

      //  System.out.println(str.substring(5,2));//hata verir bitiş ındex başlangıç ındex sinden büyül olamaz
        System.out.println(str.substring(str.length()-1));//son harfi verir son beş harfi yazdıralım
        System.out.println(str.substring(str.length()-5));//şiyor yazdırır




    }
}
