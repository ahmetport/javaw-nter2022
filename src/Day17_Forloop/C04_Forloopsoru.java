package Day17_Forloop;

public class C04_Forloopsoru {
    public static void main(String[] args) {
        //10 ile 30 arasındaki sayıları aralarında virgül olarak aynı satırda yazdırın
        for (int i = 10; i <= 30; i++) {
            System.out.print(i + ", ");// bunda 30 da , olur o yuzden olmaz


        }
        int başlangıç = 10;
        int bitiş = 30;
        for (int i = başlangıç; i <= bitiş; i++) {

            if (i < bitiş) {
                System.out.print(i + " ,");
            } else {

                System.out.println(i);


            }

        }
    }
}


