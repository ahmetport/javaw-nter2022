package Day25_Arraylıst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_Sorupratık {
    public static void main(String[] args) {
        //verilen bir listede istenen iki indexteki elementlerin yerini kalıcı olarak degiştiren bir method oluşturun
        List<Integer> sayılar = new ArrayList<>();
        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(3);
        sayılar.add(5);

        sayılar.add(6);
        sayılar.add(1);
        sayılar.add(7);
        int ilkindex=2;
        int ikinciindex=5;
        System.out.println("swaptan önce list : "+ sayılar);
        sayılar=swapelements(sayılar, ilkindex, ikinciindex);
        System.out.println(sayılar);


    }

    public static List<Integer> swapelements(List<Integer> sayılar, int ilkindex, int ikinciindex) {
        //bir temp sayı oluşturup verilen indexlerdeki sayıları yer degiştirin indexleri kontrol edip
        //uyarı mesajı yazdırın
        int temp=0;
        if((ilkindex>sayılar.size()-1) || (ikinciindex >sayılar.size()-1)|| ilkindex<0 || ikinciindex<0) {
            System.out.println("lütfen geçerli bir index giriniz");
        }else{
            temp=sayılar.get(ilkindex);//ilkındex ı temp e attık
            sayılar.set(ilkindex,sayılar.get(ikinciindex));//ilkindex ın yerine ikinci indexı koyduk
            sayılar.set(ikinciindex,temp);//ikinci index ın yerinede tempi koyduk

        }

      return sayılar;
    }
}
