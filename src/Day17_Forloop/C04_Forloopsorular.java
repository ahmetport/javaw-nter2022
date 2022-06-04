package Day17_Forloop;

public class C04_Forloopsorular {
    public static void main(String[] args) {
        //kullanıcıdan 100 den küçük tams ayı isteyin
        //birden başlayarak girilen sayıya kadar 3 un katı olan sayıları yazdırın
        int sayı = 27;
        for (int i = 1; i <= sayı; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
