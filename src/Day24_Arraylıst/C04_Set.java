package Day24_Arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oguz");
        System.out.println(isimler);

        isimler.set(1,"seckın");//yusuf gitti seckın geldi
        System.out.println(isimler);
        //daha önceden listede var olanları da arşiv gibi tutmak istersek

        List<String> loglistesi=new ArrayList<>();
       loglistesi.add(isimler.set(2,"cosmos"));//ilkeri sildik cosmos geldi ama ilkeride log olarak tuttuk
        System.out.println(isimler);//
        System.out.println(loglistesi);//ilker


    }
}
