package Day48_Collectıons;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        //verilen bir arrayın tekrara eden elementlerini sadece bir kez yazdıran bir method oluşturun
        Integer arr[] = {3, 5, 4, 6, 3, 1, 2, 7, 8, 6, 1, 4, 2, 8};
        arrayıtekrarsızyazdır(arr);
    }

    private static void arrayıtekrarsızyazdır(Integer[] arr) {
        Set<Integer>tekrarasızelementkümesi=new HashSet<Integer>();
        for (Integer each:arr
             ) {
            tekrarasızelementkümesi.add(each);
        }
        System.out.println(tekrarasızelementkümesi);
    }
}
