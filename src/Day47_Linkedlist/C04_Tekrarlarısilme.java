package Day47_Linkedlist;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C04_Tekrarlarısilme {
    public static void main(String[] args) {


        //verilen bir arrayden tekrar eden elementleri silip unigue elementler oluşan bir array haline döndüren method oluşturun
        Integer arr[] = {3, 5, 4, 6, 3, 1, 2, 7, 8, 6, 1, 4, 2, 8};
        arr=benzersizyap(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8] BENZERSİZ ARRAY E ÇEVİRDİK

    }

    private static Integer[] benzersizyap(Integer[] arr) {
        Set<Integer>benzersizset = new TreeSet<Integer>();//setimi sıralı bir şekilde getir tree kullandık
        for (Integer each:arr  //set te index olmadıgından dolayı for each kullandık
             ) {
            benzersizset.add(each);
        }
        System.out.println(benzersizset);//[1, 2, 3, 4, 5, 6, 7, 8]bu bizim sıralı setimiz tekrarlardan kurtulduk
        Integer arrbenzersiz[]=new Integer[benzersizset.size()];
        int index=0;
        for (Integer each:benzersizset
        ) {
           arrbenzersiz[index]=each;
           index++;
        }
        return arrbenzersiz;
    }


}