package Day21_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String arr1[]={"alı", "veli","ayse"};//java ali varıablenı index olarak görür 0 dan başlar
        System.out.println(arr1[0]);//ali
        arr1[1]="esila";//veli nin yerine esila yapacagıiçin 1 yazar deger atarız
        System.out.println(arr1[1]);//esila

        //arrayın içindeki indexi kullanarak elementlere ulaşabiliriz veya güncelleriz
        int arr2[]=new int[4];
        System.out.println(arr2[1]);//0
        System.out.println(arr2[5]);//arrayındexof verir 5 yok çünkü 4 e kadar var
        System.out.println(arr2);//ıa58ceff1 (array ın  referans)  (steak deki adrese gider)arr2 non -prımıtıv oldugu için


        for (int i = 0; i < 4; i++) {
            System.out.println(arr2[i]+" ");//0 0 0 0 0yazar

        }
        //arrayı yazdırmak için javadakı arrays clasından "tostrıng" methodunu kullanırız
        System.out.println(Arrays.toString(arr2));//[0,0,0,0] arrayı böyle yazdırırız

        arr2[1]=11;//
        arr2[3]=22;//
        System.out.println(Arrays.toString(arr2));//[0,11,0,22]
    }
}
