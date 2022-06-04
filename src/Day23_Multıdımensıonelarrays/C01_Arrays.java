package Day23_Multıdımensıonelarrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);//7
        System.out.println(arr[1][1]);//10
        //ilk inner arrayın tum elementelerını yazdırın
        System.out.println(arr[0]);//referansı gösterir direk yazdırılamaz
        System.out.println(Arrays.toString(arr[0]));//[3,1,7] yazdırır
        //multı arrayllerde tum elementeleri array olarak yazdırmak istersek
         System.out.println(Arrays.deepToString(arr));//[[3,1,7], [6,10,2]]
    }
}
