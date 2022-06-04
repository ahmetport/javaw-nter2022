package Day24_Arraylıst;

import Day23_Multıdımensıonelarrays.C06_Arrayssoru3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_lıst {
    public static void main(String[] args) {
        int arr[]={};

       arr= C06_Arrayssoru3.arrayeelemanekle(arr,5);
        System.out.println(Arrays.toString(arr));

        //bir lıst oluşturalım
        List<Integer>sayılarlıst=new ArrayList<>();
        System.out.println(sayılarlıst);

        sayılarlıst.add(5);
        sayılarlıst.add(3);
        sayılarlıst.add(0,7);//[7,5,3]ındex atadık kayarak gider
        sayılarlıst.add(2,7);//[7,5,7,3]
        System.out.println(sayılarlıst);
    }
}
