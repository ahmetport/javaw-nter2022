package Day46_Iterator_Collectıons;

import java.util.LinkedList;

public class C05_LınkedList {
    public static void main(String[] args) {
        //hem list hemde queuenin child classdır
        LinkedList<Integer>list=new LinkedList<>();
        list.add(5);
        list.add(10);//add methodu list den geldigi için hep sona ekler
        list.addFirst(11);//degue den gelir başa yazar
        list.addLast(12);//sona ekler
        System.out.println(list);
        list.add(2,25);//araya element ekleyebilirim 2 index e 25 ekledik
        System.out.println(list);//[11, 5, 25, 10, 12]



    }
}
