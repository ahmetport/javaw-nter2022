package Day24_Arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C05_Getındex {
    public static void main(String[] args) {
        List<Integer> sayılarlıst=new ArrayList<>();
        sayılarlıst.add(5);
        sayılarlıst.add(3);
        sayılarlıst.add(0,7);//[7,5,3]ındex atadık kayarak gider
        sayılarlıst.add(2,7);//[7,5,7,3]
    }
}
