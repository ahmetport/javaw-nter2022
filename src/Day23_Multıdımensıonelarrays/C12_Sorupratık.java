package Day23_Multıdımensıonelarrays;

import java.util.Arrays;

public class C12_Sorupratık {
    public static void main(String[] args) {
        //aşagıdakı multı arrayın iç arraydeki tüm elemanların toplamını birer birer bulan ve her bir sonucu yeni bir
        //arrayın elemanı yapan  ve yeni arrayı ekrana yazdırın

        int arr[][]={{1,2,3},{4,5},{6,7}};
        int toplam[]=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam [i] +=arr[i][j];
            }

        }
        System.out.println(Arrays.toString(toplam));
    }

}
