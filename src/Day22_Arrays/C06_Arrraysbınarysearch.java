package Day22_Arrays;

import java.util.Arrays;

public class C06_Arrraysbınarysearch {
    public static void main(String[] args) {
        //verilen arrayda istenen bir elemanın olup olmadıgını  yazdırın
        //bınarysearch ile yapın
        //önce sort yapar,binarysearch bize aranan sayının index ını verir index dikkat
        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenensayı=5;

        Arrays.sort(arr);//
        System.out.println(Arrays.toString(arr));//ilk once sıralar
        System.out.println(Arrays.binarySearch(arr,istenensayı));//bize istedigimiz elementin index ını döner

        //eger olmayan bir elementı aratırsak
        //java bulamadıgını göstermek için - işareti koyar sonrada o sayı olsaydı sıralaması ne olacak ise o sırayı bize verir
       // dikkat olmayan sayı da sıra verir olan sayı ındex verir

    }
}
