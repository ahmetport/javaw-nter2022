package Day41_exceptıon;

public class C01_Exceptıon {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;



        try {
             c=a/b;
        } catch (Exception e) { //burada yazdıgımız e javanın exceptıon atayacagı obje
            //exceptıon ise oluşan exceptıon türü burada e varıablr adı exceptıon ise data türü
          //  e.printStackTrace();
            System.out.println(e.getMessage());


        }
        System.out.println(c);

    }
}
