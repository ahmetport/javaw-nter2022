package Day24_Arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer>sayılarlıst=new ArrayList<>();
        System.out.println(sayılarlıst);

        sayılarlıst.add(5);
        sayılarlıst.add(3);
        sayılarlıst.add(0,7);
        sayılarlıst.add(2,7);//[7,5,7,3]

        sayılarlıst.remove(3);//index olarak 3 teki elemanı siler

    }
}
