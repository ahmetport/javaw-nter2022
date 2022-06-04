package Day22_Arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {
        String str="java gün geçtıkçe güzelleşiyor";
       String kelimeler[]= str.split(" ");//space leri yok eder yerlerine virgül atar
        System.out.println(Arrays.toString(kelimeler));

        String geçtıkçe[]=str.split("geçtıkçe");//java bunu bulacak öldürecek yerıne virgül atacak
        System.out.println(Arrays.toString(geçtıkçe));//[java gun , güzelleşiyor]
        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));//[j,a,v,a,  ,g,u,n,  ,g,e,ç,t,ı,k,ç,e,  ,g,ü,z,e,l,l,e,ş,i,y,o,r,]

    }
}
