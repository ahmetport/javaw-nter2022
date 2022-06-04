package Day05_Datacastingıncrement;

public class Increment_decrement {
    public static void main(String[] args) {

        int sayı=20;
        System.out.println(sayı+10);//30 bu satırda sayının 10 fazlasını yazdırdım
        System.out.println(sayı);//20 atama yapmazsak sayı kalıcı olarak artmaz kayıtedılmez

        sayı=sayı+10;
        System.out.println(sayı);
        System.out.println(sayı=sayı+=10);//40 olur atama yaptım hemde yazdırdım
        System.out.println(sayı++);//40 burda artmadı
        System.out.println(sayı);//41
        System.out.println(++sayı);//42







    }
}
