package Day21_Arrays;

import java.util.Arrays;

public class C03_aRRAYS {
    public static void main(String[] args) {
         int arr[];//deger ataması yapmadık ama java kabul ettı kullanmamıza izin vermez
        arr=new int[6];//kabul etti
        System.out.println(Arrays.toString(arr));//kabul etmez içine deger istıyor

        System.out.println(arr.length);//element sayısını verir 6 yı verir burda lenght parantez yok

        //arraydeki her bir elemanı index degeri kadar arttıralım
        for (int i = 0; i <arr.length ; i++) {
        arr[i]+= i;
        }
        System.out.println(Arrays.toString(arr));//[0,1,2,3,4,5] yazdırır

        //son ındex deki elementi yazdıralım
        System.out.println(arr[arr.length-1]);//5 i yazar index çünkü


    }
}
