package Day22_Arrays;

import java.util.Arrays;

public class CO1_Sort {
    public static void main(String[] args) {

        String arr[] = {"S", "M", "A", "T"};
        System.out.println(Arrays.toString(arr));//[S,M,A,T]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//A,M,S,T oldu alfabetik olarak
        //javada bu sıralamaya naturel order denir sayı olursa küçükten büyüge metin olursa alfabetik sıralamaya göre



    }
}
