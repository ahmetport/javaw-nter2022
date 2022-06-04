package Day18_Nestedforloop;

public class C04_Whıleloop {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı alıp bu sayıları ve aralarındakı tum sayıları yazdıran kod oluşturun
        int başlangıç=40;
        int bitiş=60;

        for (int i = başlangıç; i <=bitiş ; i++) {
            System.out.print(i + " ");

        }
        System.out.println("");
        //aynı soru whıleloop ile yapalım
        int i=başlangıç;//int atarsak başlangıç degeri tekrar kırk olur
        while (i<=bitiş){
            System.out.print(i + " ");
            i++;//bunu yazmassak whıle loop olmaz

        }
        System.out.println(i);//başlangıç dersem sonuna 40 tekrar yazar i dersem 61 yazar
    }
}
