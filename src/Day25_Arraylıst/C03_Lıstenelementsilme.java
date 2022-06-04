package Day25_Arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C03_Lıstenelementsilme {
    public static void main(String[] args) {
        //verilen bir arrayden istenen elementi silip kalanları yenı bir array olarak yazdıran method oluşturun

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyeneleman = 3;
        istenmeyenelementisilveyazdır(arr, istenmeyeneleman);
    }

    public static void istenmeyenelementisilveyazdır(int[] arr, int istenmeyeneleman) {
        List<Integer>yenilist=new ArrayList<>();
        for (int i=0; i<arr.length; i++) {//arrayın bütün elemanlarını gözden geçirelim
            if(arr[i]!=istenmeyeneleman){//şart saglanırsa true yeni list ekle
                yenilist.add(arr[i]);

            }
        }
        System.out.println(yenilist);


    }
}
