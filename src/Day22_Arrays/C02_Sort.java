package Day22_Arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {

        //verilen bir arrayde en küçük ve en büyük degerleri yazdırın
        int arr[]={3,5,6,1,9,45,25,4,9,0};
        //sort metodu olmadan yapalım
        int enküçüksayı=Integer.MAX_VALUE;//buraya arr[0] da atayabilriz
        int enbüyüksayı=Integer.MIN_VALUE;//burayada arr[0] atayabiliriz cünkü geçiçi deger
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<enküçüksayı){
                enküçüksayı=arr[i];
            }
            if(arr[i]>enbüyüksayı){
                enbüyüksayı=arr[i];
            }
        }
        System.out.println("array deki en küçük sayı: "+ enküçüksayı);
        System.out.println("array deki en büyük sayı: "+ enbüyüksayı);
          //sort ıle yapalım daha basıt
        Arrays.sort(arr);
        System.out.println("array deki en küçük sayı: "+ arr[0]);
        System.out.println("array deki en büyük sayı: "+ arr[arr.length-1]);

    }
}
