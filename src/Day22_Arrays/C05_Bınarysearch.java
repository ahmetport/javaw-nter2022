package Day22_Arrays;

public class C05_Bınarysearch {
    public static void main(String[] args) {
        //verilen arrayda istenen bir elemanın olup olmadıgını true/false yazdırın
        //method oluşturun
        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenensayı = 7;

        istenenelemanvarmı(arr, istenensayı);//yazdırsın dedigi için dödürmeye gerek yok method un içinde direk yazdırırız


    }

    private static void istenenelemanvarmı(int[] arr, int istenensayı) {
        boolean sonuc = false;//olamayan bir elementide bulmak için false deyıp boolean kullanıyoruz
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == istenensayı) {
                sonuc = true;             //burda else kullanılmaz çünkü 14 eger yoksa ilk elemente bakar geri döne rdigerlerine
                                                    //bakmaz ama boolean atarsak bu sorunu çözeriz
                break;
            }
        }
        System.out.println(sonuc);
    }
}
