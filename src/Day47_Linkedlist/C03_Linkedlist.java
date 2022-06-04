package Day47_Linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class C03_Linkedlist {
    public static void main(String[] args) {

        Deque<Integer> ll1=new LinkedList<>();
       System.out.println(ll1.peek());//null
       // System.out.println(ll1.element());//boşken çalışırsa exceptıon fırlatır
        System.out.println(ll1.poll());//null
       // ll1.pop();//ilk elementi silip bize döndürür bulamazsa exceptıon fırlatır
        ll1.push(30);//
        ll1.push(20);//
        System.out.println(ll1);//[20, 30]listenin başına element ekler
        System.out.println(ll1.remove());//ilk elementi silecek ve bize dönecek
    }
}
