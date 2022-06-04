package Day46_Iterator_Collectıons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);//

        Iterator itr=liste.iterator();//ıterator methodunu oluşturdugumuz liste objesi üzerinden Arraylıst classından
                                       //çalıştırıyoruz
        //bir ıterator objesi oluşturmak için collectıon üyesi bir obje kullanmalıyız yani biz bu ıtr objesini bizim
        //örnegimizde liste objesi üzerinde çalışmak için oluşturmuş olduk.biz ıtr objesini oluşturdugumuzda ıtr collectıon
        //ılk elementin öncesine gidip bekler.(itr)5,7,8,6,9) burda bizden komut bekler
        System.out.println( itr.hasNext());//yanında element var mı true döner
        System.out.println(itr.next());//5 yazdırır
        System.out.println(itr.next());//7 yazdırır bu method yanındaki elemanı verir.
        itr.remove();//bişey yazmaz ama son verimiz olan 7 yi siler
        System.out.println(liste);//[5, 8, 6, 9]
        itr.remove();//hata verir çünkü elinde element kalmadı





    }
}
