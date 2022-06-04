package Day25_Arraylıst;

import java.util.Arrays;

public class C02_Sorupratık {
    public static void main(String[] args) {
        //verilen bir arrayden istenen elementi silip kalanları yenı bir array olarak yazdıran method oluşturun

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyeneleman = 3;
        istenmeyenelementisil(arr, istenmeyeneleman);

    }

    public static void istenmeyenelementisil(int[] arr, int istenmeyeneleman) {

        //istenmeyen element sayısını bulalım
        int sayaç = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenmeyeneleman) {
                sayaç++;
            }
        }
        //yenı arrayı oluşturalım
        int arryeni[] = new int[arr.length - sayaç];
        //eski arrayden uygun elementleri yeniye taşı
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenmeyeneleman) {
                arryeni[index] = arr[i];
                index++;
                //listeyi yazdırmak
            }
        }
        System.out.println(Arrays.toString(arryeni));


    }
}

