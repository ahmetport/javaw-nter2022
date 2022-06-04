package Day18_Nestedforloop;

public class C09_Whıleloop {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alın bu sayıyı tam bölen sayıları ve toplam kaç tane olduklarını ekranda yazdırın

        int input=20;
        int bölen=1;
        int sayac=0;

        while (bölen<=input){           //   bolen inputtan küçük oldugu sürece devam edecek

            if(input % bölen==0){
                System.out.print(bölen +" ");
                sayac++;
            }
            bölen++;                         //i yerine geçer whıle loop da arttırmassak 1 de takılı kalar
        }                                      //sonsuz loop gider
        System.out.println("");
        System.out.println(input + "sayı bölen " +sayac+" adet sayı vardır");

    }
}
