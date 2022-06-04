package Day23_Multıdımensıonelarrays;

import java.util.Arrays;

public class C05_Soru2 {
    public static void main(String[] args) {


        int arr[]={3,5,7};
        //arr[3] =8; arrayde olmayan ındex e atama yapamayız

      //  arr={1,3,7,9,}; var olan bir arraye aynı boyutta bile olsa direk yeni degerler içeren bir array atayamayız

        arr=new int[4];//[0,0,0,0] yeni arr mızın degeri yukardakı 3,5,7, öldürdük bunu atadık
        System.out.println(Arrays.toString(arr));

        int arryeni[]=new int[5];
        arr=arryeni;
        System.out.println(Arrays.toString(arr));//5 tane sıfır olur atamayı kabul ettı

        arryeni[0]=2;
        arryeni[3]=5;
        arr=arryeni;
        System.out.println(Arrays.toString(arr));
        //bir arraye içinde hazır elementlerin oldugu yenı bir array atama isterseniz bunu {1,2,3,] yazarak degil ama oluşturdugunuz
        //new int[3] dıyerek oluşturup sonra deger atayarak tamamladıgımızbir arrayı assıgn ederek yapabilirsiniz
        int arrenyeni[]={1,2,5,6};
        arr=arrenyeni;
        System.out.println(Arrays.toString(arr));//[1,2,5,6] diye atar



    }
}
