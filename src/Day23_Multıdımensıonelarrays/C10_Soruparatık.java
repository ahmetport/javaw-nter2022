package Day23_Multıdımensıonelarrays;

import java.util.Arrays;

public class C10_Soruparatık {
    public static void main(String[] args) {
        //verilen bir arrayden işten degere eşit olan elemenları kaldırıp kalanları yeni bir array olarak yazdıran method oluşturun
        int arr[]={1,2,3,4,5,3};
        int istenendeger=3;
        int sayaç=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==istenendeger){
                sayaç++;
            }
        }
        int yeniarr[]=new int[arr.length-sayaç];
        int index=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=istenendeger){
                yeniarr[index]=arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(yeniarr));

    }
}
