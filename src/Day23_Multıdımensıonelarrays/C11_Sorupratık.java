package Day23_Multıdımensıonelarrays;

public class C11_Sorupratık {
    public static void main(String[] args) {
        //aşagıdakı multı arraylerin iç arraylerinde aynı index e sahıp olan elemanların toplamını ekrana yazdıran bir program yazın
        int array1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int array2[][] = {{7, 8, 9}, {10, 11}, {12}};
        int toplam = 0;
        System.out.println(array1.length);
        System.out.println(array2.length);

        System.out.println(array1[0].length);
        System.out.println(array2[0].length);

        for (int i = 0; i < array1.length && i < array2.length; i++) {
            for (int j = 0; j < array1[i].length && j < array2[i].length; j++) {
                toplam = array1[i][j] + array2[i][j];
                System.out.println("array1 ve array2 nın" + i + " ," + j + "indexleri toplamı=" + toplam);
                toplam = 0;
            }
        }

    }
}

