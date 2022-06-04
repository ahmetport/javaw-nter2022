package Day25_Arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C07_Listsoru {
    public static void main(String[] args) {
        //bir listede ortalamanın üstünde olan element sayısını bulunuz
        List<Double> sayılar = new ArrayList<>();
        sayılar.add(1.0);
        sayılar.add(3.0);
        sayılar.add(5.0);
        sayılar.add(3.0);
        sayılar.add(5.0);
        sayılar.add(6.0);
        sayılar.add(1.0);
        sayılar.add(7.0);
        //ortalamayı bul sonra üstünde olanları bir liste at
        Double ortalama=0.0;
        Double toplam=0.0;
        for (int i = 0; i <sayılar.size() ; i++) {
            toplam+= sayılar.get(i);
        }
        ortalama=toplam/sayılar.size();
        System.out.println(ortalama);//3.875
         List<Double>ortalamanınüstündekiler=new ArrayList<>();//for un içine atacagımız list ı oluşturuyoruz
        for (int i = 0; i < sayılar.size(); i++) {
            if(sayılar.get(i)>ortalama){
                ortalamanınüstündekiler.add(sayılar.get(i));
            }
        }
        System.out.println(ortalamanınüstündekiler);



    }
}
