package Day23_Multıdımensıonelarrays;

public class C09_Soruprtatık {
    public static void main(String[] args) {

        //aşagıdakı multı arrayın tum elemanlarının çarpımını ekrana yazdıran bir method yazınız

        int arr[][]={{1,2,3},{4,5,6}};
        sayılarıçarpma(arr);


    }

    private static void sayılarıçarpma(int[][] arr) {
        int çarpım=1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                çarpım *=arr[i][j];
            }
        }
        System.out.println("sayıların çarpımı:" +çarpım);
    }
}
