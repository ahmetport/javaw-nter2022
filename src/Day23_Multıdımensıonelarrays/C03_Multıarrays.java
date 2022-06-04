package Day23_Multıdımensıonelarrays;

public class C03_Multıarrays {
    public static void main(String[] args) {

        //boyutlarıbelirli bir arrayı elementleri girmeden oluşturalım
        //bir okulda içinde 24 ögrencı olan 8 sınıf vardır
        int arr[][]=new int[8][24];
        // bir ilçede her birinde 24 ögrencilik 8 sınıf olan 5 okul vardır
        int ilçe[][][]=new int[5][8][24];
        //bir okulda 3 tane 24 kişilik 2 tanede 22 iki kişilik sınıf vardır
        int sınıf24[][]=new int[3][24];//boyutları farklı oldugundan iki tane array oluştururuz
        int sınıf22[][]=new int[2][22];

        //oluştururken elementlere atama yaparsak farklı uzunlukta inner array tanımlayabiliriz
        int arr1[][]={{3,1,7},{6,10,2}};

    }
}
