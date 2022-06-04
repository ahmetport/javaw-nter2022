package Day09_Ternaryswıtch;

public class C04_Nestedternary {
    public static void main(String[] args) {
        //verilen sayının pozitif mi negatif mi
        //pozitif  veya 0 ise tek veya çift negatif sayı ise -100 den büyük veya küçük oldugunu yazdırın
        int sayı =-20;

        if (sayı >= 0) {
            if (sayı % 2 == 0) {
                System.out.println("sayı pozitif çift sayı");
            } else {
                System.out.println("sayı pozitif tek sayı");


            }
        } else {
            if (sayı < -100) {
                System.out.println("sayı -100 den küçük negatif sayı");

            } else {
                System.out.println("sayı -100 den büyük negatif sayı");

            }

        }

            // şimdi bu soruyu ternary ile çözecegiz
        String sonuc= sayı>=0 ?
                (sayı%2==0 ? "pozitif çift sayı" : "pozitif tek sayı") :
                (sayı<-100 ? "-100 den küçük negatif sayı" : "-100 den büyük negatif sayı" );
        System.out.println(sonuc);

        //iç içe ternary yaptık

    }
}





