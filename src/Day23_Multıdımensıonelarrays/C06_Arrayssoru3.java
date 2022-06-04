package Day23_Multıdımensıonelarrays;

import java.util.Arrays;

public class C06_Arrayssoru3 {
    public static void main(String[] args) {
        //verilen bir arraye yeni bir element ekleyen bir method oluşturun
        int arr[]={3,5,7};
        int eklenecekelement=4; //arraylerde normalde atama yapamayız ancak bu şekılde yapabiliriz yeni arrey oluşturacagız
        //ve yeni arrey e eskı arrey ı atıp ondan sonrada ekleme yapacagız

        arr=arrayeelemanekle(arr,eklenecekelement);
        System.out.println(Arrays.toString(arr));//[3,5,7,4]eklemeyi yaptık
        //artık istedigimiz kadar arrey e element ekleyebiliriz.
    }

    public static int[] arrayeelemanekle(int[] arr, int eklenecekelement) {
        int yeniarr[]=new int[arr.length+1];//0,0,0,0 yeni arrayım bu durumda
        for (int i = 0; i <arr.length ; i++) {
            yeniarr[i]=arr[i];
        }
        yeniarr[yeniarr.length-1]=eklenecekelement;





        return yeniarr;

    }
}
