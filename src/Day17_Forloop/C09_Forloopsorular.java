package Day17_Forloop;

public class C09_Forloopsorular {
    public static void main(String[] args) {


        //kullanıcıdan iki sayı isteyin girilen sayılar ve aralarındaki tüm sayıları toplayıp sonucunu yazdıran program yazdırın
        // Scanner scan=new Scanner(System.in);
        // System.out.println("ilk sayı giriniz");
        // int x=scan.nextInt();
        // System.out.println("ikinci sayıyı giriniz");
        // int y= scan.nextInt();
        // int toplam=0;

        // for (int i = x; i <=y ; i++) {
        // toplam += i;

        // System.out.println(toplam);


        //10 dan küçük bir sayı giriniz girilen sayının faktöriyelini bulunuz
        int input = 5;
        int foktorıyel = 1;//faktöriyel oldugu için 1 alınır
        String faktorıyelaçıkyazım = "";
        for (int i = input; i >= 1; i--) {
            foktorıyel *=i;

            if (i == input) {
                faktorıyelaçıkyazım = faktorıyelaçıkyazım + i;//burası sadece 5 yazar başinda yıldız olmasın diye yaptık

            } else
                faktorıyelaçıkyazım=faktorıyelaçıkyazım + "*" + i;//4*3*2*1 yazar
            }
            System.out.print(input+"! =" + faktorıyelaçıkyazım + " =" +foktorıyel);

        }


    }















