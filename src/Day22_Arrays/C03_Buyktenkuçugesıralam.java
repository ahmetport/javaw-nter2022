package Day22_Arrays;

import java.util.Arrays;

public class C03_Buyktenkuçugesıralam {
    public static void main(String[] args) {
        //verilen bir arrayı büyükten küçüge sıralayıp bir method oluşturun
        int arr[]={3,5,6,1,9,45,25,4,9,0};
        terstensıralayazdır(arr);
    }

    private static void terstensıralayazdır(int[] arr) {

        Arrays.sort(arr);//array sıraladık küçükten büyüğe dogru
        int tersarr[]=new int[arr.length];//yeni bir array oluşturdum içi boş ama benimki ile uzunlugu aynı
        for (int i=0; i<arr.length; i++) {
            tersarr[i] = arr[arr.length - 1 - i];//tersten arrayın ilk elementi benim arrayın son elementi olacak
           //i 0 oldugunda =normal elementin -1 sonunu aldık i ye baglı olması için -1 dedik yani ters arr 1 oldugunda
            //normal arr sondan 1 olacak i ye baglı oldugundan loop içinde dönmesi için -i dedik

        }
        System.out.println(Arrays.toString(tersarr));
    }
}
