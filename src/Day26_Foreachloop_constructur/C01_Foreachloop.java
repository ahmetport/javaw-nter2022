package Day26_Foreachloop_constructur;

public class C01_Foreachloop {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,11};
        //for loop ıle yazdırsak
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println("");
        //bunu foreach ıle yaparsak each loopu çalıştırmak için hedef bir collectıon vermeliyiz
        for (int each : arr
             ) {
            System.out.print(each +" ");

        }
    }
}
