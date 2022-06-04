package Day09_Ternaryswıtch;

public class C03_Ternary {
    public static void main(String[] args) {

        //verilen sayının 3 veya daha çok basamaklı olup olmadıgını kontrol eden ve sonucu yazdıran ternery oluşturun

        int sayı =101;

        String sonuc=sayı>=100 ? "sayı 3 basamaklı veya daha büyük" : "sayı negatif veya 3 basamaklı degil";
        System.out.println("girdiginiz sayı analizi :" + sonuc);



    }
}
