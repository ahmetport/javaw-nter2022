package Day25_Arraylıst;

import java.util.Arrays;
import java.util.List;

public class C06_Arraydenlist {
    public static void main(String[] args) {
        //verilen bir arrayı lıste çevirin
        String arr[]={"A" , "B" ,"C"};
        List<String> Arraydenlist = Arrays.asList(arr);
        //yeni oluşturulanliste add,remove,ve clear kullanamayız çok kullanılmaz bu method
        System.out.println("10 nuncu satırdakı list:" + Arraydenlist);
        arr[1]="F";//bunu atama yaparsam hep list hemde arraylıst degişiyor




    }
}
