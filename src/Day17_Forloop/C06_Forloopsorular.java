package Day17_Forloop;

public class C06_Forloopsorular {
    public static void main(String[] args) {
        //verilen iki harf ve aralarındaki harfleri yazdıran bir kod yazınız
        char ilkharf='a';
        char sonharf='d';

        for (char i = ilkharf; i <=sonharf ; i++) {
            System.out.print(i + " ");
        }
        double başlangıç=10;
        double bitiş=20;
        double artış=0.2;
        //başlangıç ve bitiş sayıları arasında artış mıktarı ile olacak tum sayıları yazdırın
        for (double i = başlangıç; i <=20 ; i+=artış) {
            System.out.print(i +" ");

        }


    }

}
