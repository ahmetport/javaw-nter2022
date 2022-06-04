package Day47_Linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Linkedlist {
    public static void main(String[] args) {
        Deque<Integer>ll1=new LinkedList<>();
        ll1.addFirst(10);
        ll1.addLast(20);
        System.out.println(ll1);
        System.out.println(ll1.element());//ilk elementi silmeden bize döndürür
        System.out.println(ll1.getLast());//20 i getirir
        ll1.offer(30);
        System.out.println(ll1);//30 u sona ekledi
        System.out.println(ll1.peek());//baştaki elementi getirdi silmedi ilk element yoksa exceptıon fırlatır
        //bulamazsa null döndürüyor
        System.out.println(ll1.poll());//siliyor hemde döndürüyor bulamazsa null döndürüyor
        System.out.println(ll1);//


    }
}
