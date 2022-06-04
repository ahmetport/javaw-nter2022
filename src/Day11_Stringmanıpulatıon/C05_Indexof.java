package Day11_Stringmanıpulatıon;

public class C05_Indexof {
    public static void main(String[] args) {
        String str1="java bir baska güzel";

        //istersek char olarak verdigimiz bir harfin index ını bize döndürür
        System.out.println(str1.indexOf('j'));//0
        //istersek bir harf veye metin olarak verdigimiz stringin ındex ini döndürür
        System.out.println(str1.indexOf("l"));//19
        System.out.println(str1.length()-1);//19
        System.out.println(str1.indexOf("aska"));//10

        //aynı harfden birden fazla varsa?
        System.out.println(str1.indexOf("b"));//5 buldugu ilk dogru eşleştirmeyi getirir
        System.out.println(str1.indexOf('b' , 5));//bu method da java aramaya fromindex den sonraki sayıdan
                                                               //başlar
        //verilen strindeki 2.a harfinin index bulalım
        int ilkındex=str1.indexOf('a');//1
        System.out.println(str1.indexOf('a' , ilkındex+1));//3

        //stringde olmayan bir harf aratsak
        System.out.println(str1.indexOf('y'));//-1
        System.out.println(str1.indexOf("ahmet"));//-1 yoksa herzaman -1 dir


















    }
}
