package Day05_Datacastingıncrement;

public class pre_postıncrement {
    public static void main(String[] args) {

        int sayı=10;// bu sayıyı +1 arttırmal için
        sayı++;
        System.out.println(sayı);//11
        sayı++;
        System.out.println(sayı);//12

        System.out.println("preıncrement satırında" + ++sayı);// 13 önce arttır sonra yazdır demek
        System.out.println("preıncrementden sonra" +sayı);//13

        System.out.println("postincrement satırında " + sayı++);//13 önce yazdır sonra arttır
        System.out.println("postıncrement satırından sonra " + sayı);//14 yazdırır
        //sadece işlem önceligi ile ilgili


    }
}
