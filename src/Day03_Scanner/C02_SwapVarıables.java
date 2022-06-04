package Day03_Scanner;

public class C02_SwapVarıables {
    public static void main(String[] args) {
//degişken atayarak swap yapma;
        //int sayı=10;
        //int sayı1=20;

       // System.out.println("swap dan önce sayı:"+sayı1+ ", sayı1: "+ sayı1);


      //  int temp=sayı;
      //  sayı=sayı1;
       // sayı1=temp;


       // System.out.println("swapdan sonra sayı: "+sayı+ " sayı1: "+ sayı1);
        //temp olmadan sayıyı aynı şekilde yazdırma

        int rakam1=15;
        int rakam2=20;
        System.out.println("swapdan önce rakam1: "+rakam1+" rakam2: "+rakam2 );


        rakam1=rakam1+rakam2;//35
        rakam2=rakam1-rakam2;//15
        rakam1=rakam1-rakam2;//20
        System.out.println("son hali rakam1: "+rakam1+"  rakam2: "+rakam2);




    }
}
