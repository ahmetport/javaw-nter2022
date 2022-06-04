package Day18_Nestedforloop;

public class C01_Nestedforloop1 {
    public static void main(String[] args) {

        //kullanıcıdan bir rakam alın çarpım tablosu oluşturalım
        int input=5;

        for (int i=1; i<=input; i++){
            for (int j = 1; j <=input ; j++) {
                System.out.print((i*j));

            }
            System.out.println("");//alt alta yazması için parantezin altına yazılıyor

        }//dış loop un sonu

    }
}
