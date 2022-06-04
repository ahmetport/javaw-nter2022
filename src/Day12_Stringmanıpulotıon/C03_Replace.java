package Day12_Stringmanıpulotıon;

public class C03_Replace {
    public static void main(String[] args) {
        //bu cümledeki boşluk dışındaki karakter sayısını bulunuz
        String str="bugun ne çok şey ögrendik";

        System.out.println("space hariç karakter sayısı"+str.replace(" " , "").length());//karakter
        System.out.println("orjınal str karakter sayısı:" +str.length());//atama yapılmamış hali
        //sayıaı istedigi için length ekledik
        //atama yapılmadıgı sürece orjınal string kalıcı olarak degişmez
        //sadece o satır için degişiklik yapılıp sonuç yazdırılır
        //atama yoksa kalıcı degişiklikde yok


        //stringde kalıcı bir atama yapalım,bugun yerine yarın,ögrendik yerine ögrenecegiz
        str=str.replace("bugun" ,"yarın");
        str=str.replace("ögrendik", "ogrenecegiz");
        System.out.println("kalıcı degişiklikten sonra :" +str);

         str.replace("ne cok" , "ne az");//bunu yazdırmadı çünkü atama yapmadım
        System.out.println(str);







    }
}
