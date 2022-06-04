package Day48_Collectıons;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {
        String str="java çok güzel";
        System.out.println(str.hashCode());//-1836360911

        String str1=" hava çok güzel";
        System.out.println(str1.hashCode());//171773971
        String str2="hava çok güzel";
        System.out.println(str2.hashCode());
        Set<Integer> sayıkümesi=new HashSet<Integer>();
        System.out.println(sayıkümesi.hashCode());//0
        sayıkümesi.add(10);
        System.out.println(sayıkümesi.hashCode());//10
    }
}
