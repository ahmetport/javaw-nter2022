package Day17_Forloop;

public class C07_Forloopsorular {
    public static void main(String[] args) {
        //kullanıcıdan 100 den küçük bir tamsayı isteyin 1 den başlayarak girilen sayıya kadar tüm sayıları yazdırın
        //sayı 3 ün katı ise sayı yerine "java" yazdırın
        //sayı 5 in katı isesayı yerine "güzeldir" yazdırın
        //sayı hem 3 un hem 5 ın katı ise sayı yerine"java güzeldir" yazdırın

        int sayı=15;
        for (int i = 0; i <=sayı ; i++) {
            if(i%3==0 && i%5==0){
                System.out.print("java güzeldir");

            }else if(i%3==0){
                System.out.print("java");
            }else if(i%5==0){
                System.out.print("güzeldir");

            }else{
                System.out.print(i + " ");
            }

        }

    }
}
