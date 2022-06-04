package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Lambda05 {


    public static void main(String[] args) {
        System.out.println(ameletoplam(10));
        System.out.println(" **** ");
        System.out.println(toplalambda(10));
        System.out.println(" **** ");
        System.out.println(çiftsayıalrıtopla(10));
        System.out.println(" **** ");
        System.out.println(ilkxçiftsayıyıtopla(10));
        System.out.println(" **** ");
        System.out.println(ilkxteksayıyıtopla(8));
        ikininilkxkuvveti(5);
        System.out.println(" **** ");
        istenilensayınınilklkxkuvveti(3,5);
        System.out.println(" **** ");
        System.out.println(xkuvveti(3,2));


    }
    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.

    //Structured(AMELE) Programming
    public static int ameletoplam(int x) {
        int toplam = 0;
        for (int i = 1; i <= x; i++) {
            toplam += i;
        }
        return toplam;
    }


    //Functional(cincix Programming
    public static int toplalambda(int x) {
        return IntStream.range(1, x + 1).sum();

    }

    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int çiftsayıalrıtopla(int x) {
        return IntStream.
                rangeClosed(1, x).
                filter(Lambda01::ciftBul).
                sum();
    }


    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int ilkxçiftsayıyıtopla(int x) {
        return IntStream.
                iterate(2, t -> t + 2).
                limit(x).
                sum();
    }


    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.

    public static int ilkxteksayıyıtopla(int x) {
        return IntStream.
                iterate(1, t -> t + 2).
                limit(x).
                sum();
    }


    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void ikininilkxkuvveti(int x) {
        IntStream.
                iterate(2, t -> t * 2).
                limit(x).
                forEach(Lambda01::yazdir);

    }


    //TASK 06 --> Istenilen birsayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.

    public static void istenilensayınınilklkxkuvveti(int istenenSayi, int x) {
        IntStream.iterate(istenenSayi, t -> t * istenenSayi).limit(x).forEach(Lambda01::yazdir);
    }


        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
        public static void faktöriyel(int x) {
            IntStream.rangeClosed(1, x).reduce(Math::multiplyExact);
        }



        //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
        public static int xkuvveti(int istenenSayi,int x){
        return IntStream.iterate(istenenSayi,t->t*istenenSayi).limit(x).reduce(0,(t,u)->u);
        }

        }
















