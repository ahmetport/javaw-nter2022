package Day33_Varargs;

public class C05_Sb {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Ali can");
        StringBuilder sb2=new StringBuilder("Bli can");

        String str="Ali can";

        System.out.println(sb1.compareTo(sb2));//-1 İKİ STRİNG BUİLDERE ilk harften başlayarak tüm karakterleri karşılaştırı
        //iki sb yi kontrol etmek için karşılaştırır aynı olan karakter için bi şey yazdırmaz farklı olan karakter için kaç deger
        //ileride ve geride oldugunu gösterir



    }
}
